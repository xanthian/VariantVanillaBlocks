package net.xanthian.variantvanillablocks;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.xanthian.variantvanillablocks.datagen.*;

public class DataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {


        fabricDataGenerator.addProvider(LootTableGenerator::new);
        fabricDataGenerator.addProvider(RecipeGenerator::new);
        fabricDataGenerator.addProvider(ModelGenerator::new);
        fabricDataGenerator.addProvider(BlockTagGenerator::new);
        fabricDataGenerator.addProvider(ItemTagGenerator::new);
        fabricDataGenerator.addProvider(LangFileGenerator::new);

    }
}