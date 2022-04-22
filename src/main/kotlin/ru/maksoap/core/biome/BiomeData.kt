package ru.maksoap.core.biome

import ru.maksoap.core.biome.Type.*

class Biome(val name: String, val types: List<Type>) {

    constructor(name: String, vararg types: Type): this(name, types.toList())

    companion object {
        private val biomeList: MutableList<Biome> = arrayListOf()

        fun addBiomes(biomes: List<Biome>) = biomeList.addAll(biomes)

        fun applyBiomes(biomes: List<Biome>) = biomeList.apply {
            clear()
            addBiomes(biomes)
        }

        fun biomeByName(name: String): Biome? = biomeList.firstOrNull { it.name == name }
    }
}

enum class Type {
    HOT, COLD, SPARSE, DENSE, WET, DRY, SAVANNA,
    CONIFEROUS, JUNGLE, SPOOKY, DEAD, LUSH, NETHER,
    END, MUSHROOM, MAGICAL, OCEAN, RIVER, WATER, MESA,
    FOREST, PLAINS, MOUNTAIN, HILLS, SWAMP, SANDY, SNOWY, WASTELAND, BEACH,
    /**@deprecated*/
    DESERT,
    /**@deprecated*/
    FROZEN;
}

object BiomeData {

    val ocean = "Ocean"
    val plains = "Plains"
    val desert = "Desert"
    val extreme_Hills = "Extreme Hills"
    val forest = "Forest"
    val taiga = "Taiga"
    val swampland = "Swampland"
    val river = "River"
    val hell = "Hell"
    val sky = "Sky"
    val frozenOcean = "FrozenOcean"
    val frozenRiver = "FrozenRiver"
    val ice_Plains = "Ice Plains"
    val ice_Mountains = "Ice Mountains"
    val mushroomIsland = "MushroomIsland"
    val mushroomIslandShore = "MushroomIslandShore"
    val beach = "Beach"
    val desertHills = "DesertHills"
    val forestHills = "ForestHills"
    val taigaHills = "TaigaHills"
    val extreme_Hills_Edge = "Extreme Hills Edge"
    val jungle = "Jungle"
    val jungleHills = "JungleHills"
    val jungleEdge = "JungleEdge"
    val deep_Ocean = "Deep Ocean"
    val stone_Beach = "Stone Beach"
    val cold_Beach = "Cold Beach"
    val birch_Forest = "Birch Forest"
    val birch_Forest_Hills = "Birch Forest Hills"
    val roofed_Forest = "Roofed Forest"
    val cold_Taiga = "Cold Taiga"
    val cold_Taiga_Hills = "Cold Taiga Hills"
    val mega_Taiga = "Mega Taiga"
    val mega_Taiga_Hills = "Mega Taiga Hills"
    val extreme_HillsPlus = "Extreme Hills+"
    val savanna = "Savanna"
    val savanna_Plateau = "Savanna Plateau"
    val mesa = "Mesa"
    val mesa_Plateau_F = "Mesa Plateau F"
    val mesa_Plateau = "Mesa Plateau"


    val alps = "Alps"
    val alps_Forest = "Alps Forest"
    val arctic = "Arctic"
    val asteroids = "asteroids"
    val bamboo_Forest = "Bamboo Forest"
    val bayou = "Bayou"
    val birch_Forest_Hills_M = "Birch Forest Hills M"
    val birch_Forest_M = "Birch Forest M"
    val bog = "Bog"
    val boneyard = "Boneyard"
    val boreal_Forest = "Boreal Forest"
    val brushland = "Brushland"
    val canyon = "Canyon"
    val canyon_Ravine = "Canyon Ravine"
    val chaparral = "Chaparral"
    val cherry_Blossom_Grove = "Cherry Blossom Grove"
    val cold_Taiga_M = "Cold Taiga M"
    val coniferous_Forest = "Coniferous Forest"
    val coral_Reef = "Coral Reef"
    val corrupted_Sands = "Corrupted Sands"
    val crag = "Crag"
    val dark_Forest = "Dark Forest"
    val dark_Forest_Center = "Dark Forest Center"
    val dead_Forest = "Dead Forest"
    val dead_Swamp = "Dead Swamp"
    val deciduous_Forest = "Deciduous Forest"
    val deep_Mushroom_Forest = "Deep Mushroom Forest"
    val dense_Forest = "Dense Forest"
    val dense_Twilight_Forest = "Dense Twilight Forest"
    val desert_M = "Desert M"
    val desert_Oil_Field = "Desert Oil Field"
    val dry_River = "Dry River"
    val eerie = "Eerie"
    val eldritch = "Eldritch"
    val enchanted_Forest = "Enchanted Forest"
    val eucalyptus_Forest = "Eucalyptus Forest"
    val extreme_Hills_M = "Extreme Hills M"
    val extreme_HillsPlus_M = "Extreme Hills+ M"
    val fen = "Fen"
    val fire_Swamp = "Fire Swamp"
    val firefly_Forest = "Firefly Forest"
    val flower_Field = "Flower Field"
    val flower_Forest = "Flower Forest"
    val frost_Forest = "Frost Forest"
    val fungi_Forest = "Fungi Forest"
    val garden = "Garden"
    val glacier = "Glacier"
    val grassland = "Grassland"
    val grove = "Grove"
    val heathland = "Heathland"
    val highland = "Highland"
    val highlands_Center = "Highlands Center"
    val ice_Plains_Spikes = "Ice Plains Spikes"
    val jade_Cliffs = "Jade Cliffs"
    val jungle_M = "Jungle M"
    val jungleEdge_M = "JungleEdge M"
    val kelp_Forest = "Kelp Forest"
    val land_of_Lakes = "Land of Lakes"
    val land_of_Lakes_Marsh = "Land of Lakes Marsh"
    val lavender_Fields = "Lavender Fields"
    val lush_Desert = "Lush Desert"
    val lush_River = "Lush River"
    val lush_Swamp = "Lush Swamp"
    val magical_Forest = "Magical Forest"
    val mangrove = "Mangrove"
    val maple_Woods = "Maple Woods"
    val marsFlat = "marsFlat"
    val marsh = "Marsh"
    val meadow = "Meadow"
    val meadow_Forest = "Meadow Forest"
    val mega_Spruce_Taiga = "Mega Spruce Taiga"
    val mesa_Bryce = "Mesa (Bryce)"
    val mesa_Plateau_F_M = "Mesa Plateau F M"
    val mesa_Plateau_M = "Mesa Plateau M"
    val moon = "moon"
    val moor = "Moor"
    val mountain = "Mountain"
    val mushroom_Forest = "Mushroom Forest"
    val mystic_Grove = "Mystic Grove"
    val oak_Savanna = "Oak Savanna"
    val oasis = "Oasis"
    val ocean_Oil_Field = "Ocean Oil Field"
    val ominous_Woods = "Ominous Woods"
    val orchard = "Orchard"
    val origin_Valley = "Origin Valley"
    val outback = "Outback"
    val phantasmagoric_Inferno = "Phantasmagoric Inferno"
    val polar_Chasm = "Polar Chasm"
    val prairie = "Prairie"
    val quagmire = "Quagmire"
    val rainforest = "Rainforest"
    val redwood_Forest = "Redwood Forest"
    val roofed_Forest_M = "Roofed Forest M"
    val rwg_coldForest = "rwg_coldForest"
    val rwg_coldPlains = "rwg_coldPlains"
    val rwg_hotDesert = "rwg_hotDesert"
    val rwg_hotForest = "rwg_hotForest"
    val rwg_hotPlains = "rwg_hotPlains"
    val rwg_jungle = "rwg_jungle"
    val rwg_oasis = "rwg_oasis"
    val rwg_oceanCold = "rwg_oceanCold"
    val rwg_oceanHot = "rwg_oceanHot"
    val rwg_oceanIce = "rwg_oceanIce"
    val rwg_oceanOasis = "rwg_oceanOasis"
    val rwg_oceanTemperate = "rwg_oceanTemperate"
    val rwg_oceanWet = "rwg_oceanWet"
    val rwg_plains = "rwg_plains"
    val rwg_redwood = "rwg_redwood"
    val rwg_riverCold = "rwg_riverCold"
    val rwg_riverHot = "rwg_riverHot"
    val rwg_riverIce = "rwg_riverIce"
    val rwg_riverOasis = "rwg_riverOasis"
    val rwg_riverTemperate = "rwg_riverTemperate"
    val rwg_riverWet = "rwg_riverWet"
    val rwg_snowDesert = "rwg_snowDesert"
    val rwg_snowForest = "rwg_snowForest"
    val rwg_temperateForest = "rwg_temperateForest"
    val rwg_tropical = "rwg_tropical"
    val sacred_Springs = "Sacred Springs"
    val savanna_M = "Savanna M"
    val savanna_Plateau_M = "Savanna Plateau M"
    val scrubland = "Scrubland"
    val seasonal_Forest = "Seasonal Forest"
    val seasonal_Forest_Clearing = "Seasonal Forest Clearing"
    val shield = "Shield"
    val shrubland = "Shrubland"
    val silkglades = "Silkglades"
    val sludgepit = "Sludgepit"
    val snowy_Coniferous_Forest = "Snowy Coniferous Forest"
    val snowy_Forest = "Snowy Forest"
    val space = "space"
    val spectral_Garden = "Spectral Garden"
    val spruce_Woods = "Spruce Woods"
    val steppe = "Steppe"
    val storage_Cell = "Storage Cell"
    val sunflower_Plains = "Sunflower Plains"
    val swampland_M = "Swampland M"
    val taiga_M = "Taiga M"
    val tainted_Land = "Tainted Land"
    val temperate_Rainforest = "Temperate Rainforest"
    val thicket = "Thicket"
    val thornlands = "Thornlands"
    val toxic_Everglades = "Toxic Everglades"
    val tropical_Rainforest = "Tropical Rainforest"
    val tropics = "Tropics"
    val tundra = "Tundra"
    val twilight_Clearing = "Twilight Clearing"
    val twilight_Forest = "Twilight Forest"
    val twilight_Glacier = "Twilight Glacier"
    val twilight_Highlands = "Twilight Highlands"
    val twilight_Lake = "Twilight Lake"
    val twilight_Stream = "Twilight Stream"
    val twilight_Swamp = "Twilight Swamp"
    val undergarden = "Undergarden"
    val visceral_Heap = "Visceral Heap"
    val volcano = "Volcano"
    val wasteland = "Wasteland"
    val wetland = "Wetland"
    val woodland = "Woodland"
    val xeric_Shrubland = "Xeric Shrubland"

    val IIABiomeType: List<Biome> = listOf(
        Biome("Ocean", OCEAN),
        Biome("Plains", PLAINS),
        Biome("Desert", HOT, DRY, SANDY),
        Biome("Extreme Hills", MOUNTAIN, HILLS),
        Biome("Forest", FOREST),
        Biome("Taiga", COLD, CONIFEROUS, FOREST),
        Biome("Swampland", WET, SWAMP),
        Biome("River", RIVER),
        Biome("Hell", HOT, DRY, NETHER),
        Biome("Sky", COLD, DRY, END),
        Biome("FrozenOcean", COLD, OCEAN, SNOWY),
        Biome("FrozenRiver", COLD, RIVER, SNOWY),
        Biome("Ice Plains", COLD, SNOWY, WASTELAND),
        Biome("Ice Mountains", COLD, SNOWY, MOUNTAIN),
        Biome("MushroomIsland", MUSHROOM),
        Biome("MushroomIslandShore", MUSHROOM, BEACH),
        Biome("Beach", BEACH),
        Biome("DesertHills", HOT, DRY, SANDY, HILLS),
        Biome("ForestHills", FOREST, HILLS),
        Biome("TaigaHills", COLD, CONIFEROUS, FOREST, HILLS),
        Biome("Extreme Hills Edge", MOUNTAIN),
        Biome("Jungle", HOT, WET, DENSE, JUNGLE),
        Biome("JungleHills", HOT, WET, DENSE, JUNGLE, HILLS),
        Biome("JungleEdge", HOT, WET, JUNGLE, FOREST),
        Biome("Deep Ocean", OCEAN),
        Biome("Stone Beach", BEACH),
        Biome("Cold Beach", COLD, BEACH, SNOWY),
        Biome("Birch Forest", FOREST),
        Biome("Birch Forest Hills", FOREST, HILLS),
        Biome("Roofed Forest", SPOOKY, DENSE, FOREST),
        Biome("Cold Taiga", COLD, CONIFEROUS, FOREST, SNOWY),
        Biome("Cold Taiga Hills", COLD, CONIFEROUS, FOREST, SNOWY, HILLS),
        Biome("Mega Taiga", COLD, CONIFEROUS, FOREST),
        Biome("Mega Taiga Hills", COLD, CONIFEROUS, FOREST, HILLS),
        Biome("Extreme Hills+", MOUNTAIN, FOREST, SPARSE),
        Biome("Savanna", HOT, SAVANNA, PLAINS, SPARSE),
        Biome("Savanna Plateau", HOT, SAVANNA, PLAINS, SPARSE),
        Biome("Mesa", MESA, SANDY),
        Biome("Mesa Plateau F", MESA, SPARSE, SANDY),
        Biome("Mesa Plateau", MESA, SANDY)
    )

    val GTNHBiomeType: List<Biome> = listOf(
        Biome("Alps", COLD, MOUNTAIN, SNOWY),
        Biome("Alps Forest", COLD, FOREST, MOUNTAIN, SNOWY),
        Biome("Arctic", COLD, DEAD, SNOWY, WASTELAND),
        Biome("asteroids", COLD, DRY, SPOOKY, DEAD),
        Biome("Bamboo Forest", DENSE, JUNGLE, LUSH, FOREST),
        Biome("Bayou", WET, LUSH, OCEAN, RIVER, SWAMP),
        // Biome("Beach", BEACH),
        // Biome("Birch Forest", FOREST),
        // Biome("Birch Forest Hills", FOREST, HILLS),
        // Biome("Birch Forest Hills M", HILLS),
        // Biome("Birch Forest M", HILLS),
        Biome("Bog", WET, DEAD, FOREST, SWAMP),
        Biome("Boneyard", SPOOKY, NETHER, WASTELAND),
        Biome("Boreal Forest", DENSE, CONIFEROUS, LUSH, FOREST),
        Biome("Brushland", HOT, DRY, SAVANNA, PLAINS),
        Biome("Canyon", HOT, SPARSE, DRY, MOUNTAIN, HILLS, SANDY),
        Biome("Canyon Ravine", HOT, DRY, HILLS, SANDY),
        Biome("Chaparral", SPARSE, PLAINS),
        Biome("Cherry Blossom Grove", LUSH, MAGICAL, FOREST),
        // Biome("Cold Beach", COLD, SNOWY, BEACH),
        // Biome("Cold Taiga", COLD, CONIFEROUS, FOREST, SNOWY),
        // Biome("Cold Taiga Hills", COLD, CONIFEROUS, FOREST, HILLS, SNOWY),
        // Biome("Cold Taiga M", COLD, HILLS, SNOWY),
        Biome("Coniferous Forest", DENSE, CONIFEROUS, FOREST, HILLS),
        Biome("Coral Reef", OCEAN, RIVER),
        Biome("Corrupted Sands", SPOOKY, NETHER, SANDY),
        Biome("Crag", DRY, SPOOKY, DEAD, MOUNTAIN, WASTELAND),
        Biome("Dark Forest", DENSE, SPOOKY, FOREST),
        Biome("Dark Forest Center", DENSE, SPOOKY, MAGICAL, FOREST),
        Biome("Dead Forest", SPARSE, SPOOKY, DEAD, FOREST),
        Biome("Dead Swamp", SPARSE, SPOOKY, DEAD, SWAMP),
        Biome("Deciduous Forest", DENSE, DRY, FOREST),
        Biome("Deep Mushroom Forest", MUSHROOM, FOREST),
        // Biome("Deep Ocean", OCEAN),
        Biome("Dense Forest", PLAINS),
        Biome("Dense Twilight Forest", DENSE, FOREST),
        // Biome("Desert", HOT, DRY, SANDY),
        // Biome("Desert M", HOT, DRY, PLAINS, SANDY),
        Biome("Desert Oil Field", SANDY),
        // Biome("DesertHills", HOT, DRY, HILLS, SANDY),
        Biome("Dry River", HOT, DRY, PLAINS, SANDY),
        Biome("Eerie", SPOOKY, MAGICAL),
        Biome("Eldritch", SPOOKY, END, MAGICAL),
        Biome("Enchanted Forest", MAGICAL, FOREST),
        Biome("Eucalyptus Forest", HOT, WET, PLAINS),
        // Biome("Extreme Hills", MOUNTAIN, HILLS),
        // Biome("Extreme Hills Edge", MOUNTAIN),
        // Biome("Extreme Hills M", HILLS),
        // Biome("Extreme Hills+", SPARSE, FOREST, MOUNTAIN),
        // Biome("Extreme Hills+ M", HILLS),
        Biome("Fen", WET, DEAD, FOREST, SWAMP),
        Biome("Fire Swamp", HOT, SWAMP, WASTELAND),
        Biome("Firefly Forest", LUSH, FOREST),
        Biome("Flower Field", LUSH, PLAINS),
        Biome("Flower Forest", FOREST, HILLS),
        // Biome("Forest", FOREST),
        // Biome("ForestHills", FOREST, HILLS),
        Biome("Frost Forest", COLD, SPARSE, FOREST, SNOWY),
        // Biome("FrozenOcean", COLD, OCEAN, SNOWY),
        // Biome("FrozenRiver", COLD, RIVER, SNOWY),
        Biome("Fungi Forest", WET, LUSH, MUSHROOM, MAGICAL, FOREST, SWAMP),
        Biome("Garden", LUSH, MAGICAL, PLAINS),
        Biome("Glacier", COLD, DEAD, HILLS, SNOWY),
        Biome("Grassland", SPARSE, LUSH, PLAINS, HILLS, SWAMP),
        Biome("Grove", DENSE, LUSH, FOREST, PLAINS),
        Biome("Heathland", DRY, SAVANNA, PLAINS),
        // Biome("Hell", HOT, DRY, NETHER),
        Biome("Highland", SPARSE, MOUNTAIN, HILLS),
        Biome("Highlands Center", DRY, DEAD, MESA, WASTELAND),
        // Biome("Ice Mountains", COLD, MOUNTAIN, SNOWY),
        // Biome("Ice Plains", COLD, SNOWY, WASTELAND),
        // Biome("Ice Plains Spikes", COLD, HILLS, SNOWY),
        Biome("Jade Cliffs", DENSE, FOREST, MOUNTAIN),
        // Biome("Jungle", HOT, DENSE, WET, JUNGLE),
        // Biome("Jungle M", HOT, WET, HILLS),
        // Biome("JungleEdge", HOT, WET, JUNGLE, FOREST),
        // Biome("JungleEdge M", HOT, HILLS),
        // Biome("JungleHills", HOT, DENSE, WET, JUNGLE, HILLS),
        Biome("Kelp Forest", OCEAN, RIVER, FOREST),
        Biome("Land of Lakes", WET, PLAINS),
        Biome("Land of Lakes Marsh", WET, SWAMP),
        Biome("Lavender Fields", SPARSE, LUSH, PLAINS),
        Biome("Lush Desert", HOT, DRY, SAVANNA, LUSH, SANDY),
        Biome("Lush River", RIVER, PLAINS),
        Biome("Lush Swamp", WET, LUSH, OCEAN, RIVER, SWAMP),
        Biome("Magical Forest", MAGICAL, FOREST),
        Biome("Mangrove", WET, LUSH, OCEAN, RIVER, FOREST),
        Biome("Maple Woods", COLD, FOREST),
        Biome("marsFlat", COLD, DRY, DEAD, SANDY),
        Biome("Marsh", SPARSE, WET, LUSH, OCEAN, RIVER, SWAMP),
        Biome("Meadow", LUSH, FOREST, PLAINS),
        Biome("Meadow Forest", LUSH, FOREST, PLAINS),
        // Biome("Mega Spruce Taiga", DENSE, FOREST),
        // Biome("Mega Taiga", COLD, CONIFEROUS, FOREST),
        // Biome("Mega Taiga Hills", COLD, CONIFEROUS, FOREST, HILLS),
        // Biome("Mesa", MESA, SANDY),
        Biome("Mesa (Bryce)", HOT, DRY, PLAINS, SANDY),
        // Biome("Mesa Plateau", MESA, SANDY),
        // Biome("Mesa Plateau F", SPARSE, MESA, SANDY),
        // Biome("Mesa Plateau F M", HOT, DRY, FOREST, SANDY),
        // Biome("Mesa Plateau M", HOT, DRY, PLAINS, SANDY),
        Biome("moon", COLD, DRY, DEAD),
        Biome("Moor", SPARSE, WET, HILLS, SWAMP),
        Biome("Mountain", DRY, FOREST, MOUNTAIN),
        Biome("Mushroom Forest", MUSHROOM, FOREST),
        // Biome("MushroomIsland", MUSHROOM),
        // Biome("MushroomIslandShore", MUSHROOM, BEACH),
        Biome("Mystic Grove", WET, LUSH, MAGICAL, FOREST),
        Biome("Oak Savanna", SPARSE, FOREST),
        Biome("Oasis", HOT, DRY, JUNGLE, LUSH, SANDY),
        // Biome("Ocean", OCEAN),
        Biome("Ocean Oil Field", OCEAN, RIVER),
        Biome("Ominous Woods", SPOOKY, DEAD, MAGICAL, FOREST, SWAMP),
        Biome("Orchard", SPARSE, LUSH, FOREST, PLAINS),
        Biome("Origin Valley", PLAINS),
        Biome("Outback", HOT, DRY, SAVANNA, PLAINS, SANDY),
        Biome("Phantasmagoric Inferno", SPOOKY, NETHER),
        // Biome("Plains", PLAINS),
        Biome("Polar Chasm", HOT, DRY, SAVANNA, PLAINS),
        Biome("Prairie", SPARSE, DRY, PLAINS),
        Biome("Quagmire", WET, SPOOKY, DEAD, SWAMP, WASTELAND),
        Biome("Rainforest", DENSE, WET, JUNGLE, LUSH, FOREST, HILLS),
        Biome("Redwood Forest", DENSE, CONIFEROUS, FOREST),
        // Biome("River", RIVER),
        // Biome("Roofed Forest", DENSE, SPOOKY, FOREST),
        // Biome("Roofed Forest M", HILLS),
        Biome("rwg_coldForest", COLD, DENSE, CONIFEROUS, FOREST, HILLS),
        Biome("rwg_coldPlains", COLD, WASTELAND),
        Biome("rwg_hotDesert", HOT, DRY, SANDY),
        Biome("rwg_hotForest", HOT, SPARSE, SAVANNA, PLAINS),
        Biome("rwg_hotPlains", HOT, SPARSE, SAVANNA, PLAINS),
        Biome("rwg_jungle", HOT, WET, JUNGLE),
        Biome("rwg_oasis", HOT, WET, PLAINS),
        Biome("rwg_oceanCold", COLD, CONIFEROUS, OCEAN, FOREST, BEACH),
        Biome("rwg_oceanHot", HOT, DRY, OCEAN, SANDY, BEACH),
        Biome("rwg_oceanIce", COLD, OCEAN, SNOWY, BEACH),
        Biome("rwg_oceanOasis", HOT, WET, JUNGLE, OCEAN, BEACH),
        Biome("rwg_oceanTemperate", COLD, OCEAN, FOREST, BEACH),
        Biome("rwg_oceanWet", HOT, WET, JUNGLE, OCEAN, BEACH),
        Biome("rwg_plains", PLAINS),
        Biome("rwg_redwood", COLD, CONIFEROUS, FOREST),
        Biome("rwg_riverCold", COLD, CONIFEROUS, RIVER, FOREST),
        Biome("rwg_riverHot", HOT, DRY, RIVER, SANDY),
        Biome("rwg_riverIce", COLD, RIVER, SNOWY),
        Biome("rwg_riverOasis", HOT, WET, JUNGLE, RIVER),
        Biome("rwg_riverTemperate", COLD, RIVER, FOREST),
        Biome("rwg_riverWet", HOT, WET, JUNGLE, RIVER),
        Biome("rwg_snowDesert", COLD, SNOWY, WASTELAND),
        Biome("rwg_snowForest", COLD, CONIFEROUS, FOREST, SNOWY),
        Biome("rwg_temperateForest", PLAINS),
        Biome("rwg_tropical", HOT, WET, JUNGLE),
        Biome("Sacred Springs", DENSE, WET, LUSH, MAGICAL, FOREST, MOUNTAIN),
        // Biome("Savanna", HOT, SPARSE, SAVANNA, PLAINS),
        // Biome("Savanna M", HOT, SPARSE, DRY, SAVANNA, HILLS),
        // Biome("Savanna Plateau", HOT, SPARSE, SAVANNA, PLAINS),
        // Biome("Savanna Plateau M", HOT, SPARSE, DRY, SAVANNA, HILLS),
        Biome("Scrubland", HOT, SPARSE, DRY, SAVANNA, PLAINS),
        Biome("Seasonal Forest", DENSE, LUSH, FOREST),
        Biome("Seasonal Forest Clearing", PLAINS),
        Biome("Shield", WET, CONIFEROUS, OCEAN, RIVER, FOREST),
        Biome("Shrubland", SPARSE, DRY, PLAINS),
        Biome("Silkglades", SPOOKY, DEAD, FOREST, SWAMP),
        // Biome("Sky", COLD, DRY, END),
        Biome("Sludgepit", WET, SPOOKY, DEAD, FOREST, SWAMP, WASTELAND),
        Biome("Snowy Coniferous Forest", COLD, DENSE, CONIFEROUS, FOREST, HILLS, SNOWY),
        Biome("Snowy Forest", COLD, CONIFEROUS, FOREST, SNOWY),
        Biome("space", DRY, PLAINS),
        Biome("Spectral Garden", HOT, DRY, SAVANNA, PLAINS),
        Biome("Spruce Woods", DENSE, CONIFEROUS, LUSH, FOREST),
        Biome("Steppe", HOT, SPARSE, DRY, SAVANNA, DEAD, PLAINS, SANDY),
        // Biome("Stone Beach", BEACH),
        Biome("Storage Cell", COLD, PLAINS),
        Biome("Sunflower Plains", PLAINS),
        // Biome("Swampland", WET, SWAMP),
        // Biome("Swampland M", WET, SWAMP),
        // Biome("Taiga", COLD, CONIFEROUS, FOREST),
        // Biome("Taiga M", HILLS),
        // Biome("TaigaHills", COLD, CONIFEROUS, FOREST, HILLS),
        Biome("Tainted Land", MAGICAL, WASTELAND),
        Biome("Temperate Rainforest", WET, CONIFEROUS, LUSH, FOREST, HILLS),
        Biome("Thicket", DENSE, DRY, DEAD, FOREST, PLAINS),
        Biome("Thornlands", DRY, DEAD, HILLS, WASTELAND),
        Biome("Toxic Everglades", DENSE, DEAD, FOREST, HILLS),
        Biome("Tropical Rainforest", HOT, DENSE, WET, JUNGLE, LUSH),
        Biome("Tropics", WET, JUNGLE, LUSH, OCEAN, RIVER, BEACH),
        Biome("Tundra", COLD, SPARSE, DRY, DEAD, WASTELAND),
        Biome("Twilight Clearing", SPARSE, PLAINS),
        Biome("Twilight Forest", FOREST),
        Biome("Twilight Glacier", COLD, SNOWY, WASTELAND),
        Biome("Twilight Highlands", CONIFEROUS, FOREST, MOUNTAIN),
        Biome("Twilight Lake", OCEAN),
        Biome("Twilight Stream", RIVER),
        Biome("Twilight Swamp", WET, SWAMP),
        Biome("Undergarden", JUNGLE, SPOOKY, NETHER),
        Biome("Visceral Heap", SPOOKY, NETHER),
        Biome("Volcano", HOT, DRY, MOUNTAIN, WASTELAND),
        Biome("Wasteland", SPARSE, SPOOKY, DEAD, WASTELAND),
        Biome("Wetland", DENSE, WET, LUSH, FOREST, SWAMP),
        Biome("Woodland", DENSE, DRY, FOREST),
        Biome("Xeric Shrubland", HOT, PLAINS, SANDY)
    )
}