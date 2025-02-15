package bike.decarbonization.mc_via_host;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;


public class McViaHost extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
