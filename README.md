# ColorAPI
A Spigot API for giving color to your items easily

Let's start !

NOTE: this API is in progress and there are a lot of things to add.

So, ColorAPI is an api to quickly and easily color wool, glass and glass_pane blocks, so far.

First of all you must initialize the ColorAPI:
```Java
ColorAPI colorApi = new ColorAPI(JavaPlugin);
```
Replace JavaPlugin with the variable of your JavaPlugin class.
Now you are ready to color blocks !
To do it create a simple ItemStack with its Material as WOOL or STAINED_GLASS or STAINED_GLASS_PANE:
```Java
ItemStack wool = new ItemStack(Material.WOOL);
```
or
```Java
ItemStack glass = new ItemStack(Material.STAINED_GLASS);
```
or
```Java
ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE);
```

To color the wool for example:
```Java
colorApi.addColor(wool, Colors.Orange);
```

There are 15 colors that you can find in Colors.java file.

Then give the wool to a player to test it out!
```Java
player.getInventory().addItem(wool);
```
This will give to player an orange wool block.

That is all for now. Also I am planning to add a method to color leather armors !

Thank you !
