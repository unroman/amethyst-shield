package chaos.amyshield.block;

import chaos.amyshield.AmethystShield;
import chaos.amyshield.block.custom.AmethystDispenserBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AMETHYST_DISPENSER = registerBlock("amethyst_dispenser",
            new AmethystDispenserBlock(AbstractBlock.Settings.copy(Blocks.DISPENSER)));
    private static Block registerBlock(String name, Block item) {
        return Registry.register(Registries.BLOCK, new Identifier(AmethystShield.MOD_ID, name), item);
    }
    public static void registerModBlocks() {
        AmethystShield.LOGGER.info("Registering Blocks for Mod " + AmethystShield.MOD_ID);
    }
}
