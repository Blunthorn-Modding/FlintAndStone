package blunthorn.flintandstone;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintAndStone implements ModInitializer {

	public static final String MOD_ID = "flintandstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FabricItemSettings fabricItemSettings = new FabricItemSettings()
			.maxDamage(1);

		Item flintAndStone = new FlintAndStoneItem(fabricItemSettings);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "flint_and_stone"), flintAndStone);
		LOGGER.info(MOD_ID + " has loaded item: " + flintAndStone.toString());
	}
}