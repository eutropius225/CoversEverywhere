package eutros.coverseverywhere;

import eutros.coverseverywhere.common.covers.Covers;
import eutros.coverseverywhere.common.covers.CoversCapabilityProvider;
import eutros.coverseverywhere.common.covers.CoversFunctionHandler;
import eutros.coverseverywhere.common.items.ModItems;
import eutros.coverseverywhere.compat.gregtech.GTCECompat;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CoversEverywhere.MOD_ID,
     name = CoversEverywhere.MOD_NAME,
     version = CoversEverywhere.VERSION)
public class CoversEverywhere {

    public static final String MOD_ID = "covers_everywhere";
    public static final String MOD_NAME = "Covers Everywhere";
    public static final String VERSION = "GRADLE:VERSION";

    public CoversEverywhere() {
        Covers.init();
        ModItems.init();
        CoversFunctionHandler.init();
        GTCECompat.check();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        CoversCapabilityProvider.init();
    }

}
