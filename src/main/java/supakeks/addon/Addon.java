package supakeks.addon;

import supakeks.addon.modules.NewChunks;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();

    @Override
    public void onInitialize() {
        LOG.info("Initializing the 2b2t new chunks add-on.");

        // Modules
        Modules.get().add(new NewChunks());
    }

    @Override
    public String getPackage() {
        return "supakeks.addon";
    }
}
