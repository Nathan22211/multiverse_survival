package multiverse.multiverse_survival;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExampleMod implements ModInitializer {


	public static final Item SMALLCLAY = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static final Item BRICK_MOLD = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static final Item MORTAR = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static final Item SAND_PILE = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static final Item BRICKS = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));
	public static final Item ROCKS = new Item(new FabricItemSettings().group(ItemGroup.MISC).maxCount(64));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "small_clay"), SMALLCLAY);
		Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "brick_mold"), BRICK_MOLD);
		Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "mortar"), MORTAR);
		Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "sand_pile"), SAND_PILE);
		Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "rock"), ROCKS);
		if (FabricLoader.getInstance().isModLoaded("colorfulmasonry")) {
			Registry.register(Registry.ITEM, new Identifier("multiverse_survival", "colored_brick_mold"), BRICKS);
		}
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		System.out.println("Hello Fabric world!");
	}
}
