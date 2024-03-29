package net.jotave.simplemod.block;

import net.jotave.simplemod.SimpleMod;
import net.jotave.simplemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleMod.MODID);

    public static final RegistryObject<Block> TYPESCRIPT_BLOCK = registerBlock("typescript_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> JAVASCRIPT_BLOCK = registerBlock("javascript_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> JAVA_BLOCK = registerBlock("java_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PHP_BLOCK = registerBlock("php_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> PYTHON_BLOCK = registerBlock("python_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> CPLUSPLUS_BLOCK = registerBlock("cplusplus_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    public static final RegistryObject<Block> RUST_BLOCK = registerBlock("rust_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));

    // Adicionamos um novo bloco ao registro de blocos e o registramos como um item.
    private static <T extends Block> RegistryObject<T> registerBlock (String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);

        return toReturn;
    }

    // Para adicionar o bloco como um item no jogo, precisamos registrar o bloco e o item
    private static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
