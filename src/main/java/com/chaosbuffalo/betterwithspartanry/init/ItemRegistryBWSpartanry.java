package com.chaosbuffalo.betterwithspartanry.init;

import betterwithmods.common.BWMItems;
import com.chaosbuffalo.betterwithspartanry.BWMMatConverter;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import com.chaosbuffalo.betterwithspartanry.utils;
import com.oblivioussp.spartanweaponry.api.DamageHelper;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;
import com.oblivioussp.spartanweaponry.init.ModelRenderRegistry;
import com.oblivioussp.spartanweaponry.item.ItemBattleaxe;
import com.oblivioussp.spartanweaponry.item.ItemBoomerang;
import com.oblivioussp.spartanweaponry.item.ItemCrossbow;
import com.oblivioussp.spartanweaponry.item.ItemDagger;
import com.oblivioussp.spartanweaponry.item.ItemGreatsword;
import com.oblivioussp.spartanweaponry.item.ItemHalberd;
import com.oblivioussp.spartanweaponry.item.ItemHammer;
import com.oblivioussp.spartanweaponry.item.ItemJavelin;
import com.oblivioussp.spartanweaponry.item.ItemKatana;
import com.oblivioussp.spartanweaponry.item.ItemLance;
import com.oblivioussp.spartanweaponry.item.ItemLongbow;
import com.oblivioussp.spartanweaponry.item.ItemLongsword;
import com.oblivioussp.spartanweaponry.item.ItemMace;
import com.oblivioussp.spartanweaponry.item.ItemParryingDagger;
import com.oblivioussp.spartanweaponry.item.ItemPike;
import com.oblivioussp.spartanweaponry.item.ItemRapier;
import com.oblivioussp.spartanweaponry.item.ItemSaber;
import com.oblivioussp.spartanweaponry.item.ItemSpear;
import com.oblivioussp.spartanweaponry.item.ItemThrowingAxe;
import com.oblivioussp.spartanweaponry.item.ItemThrowingKnife;
import com.oblivioussp.spartanweaponry.item.ItemWarhammer;
import com.oblivioussp.spartanweaponry.util.ConfigHandler;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Mod.EventBusSubscriber
public class ItemRegistryBWSpartanry {
    public static final Set<BWMMatConverter> MATERIALS_TO_REGISTER = new LinkedHashSet<>();

    public static final String SOULFORGE_STEEL = "soulforgedSteel";
    static {
        MATERIALS_TO_REGISTER.add(new BWMMatConverter(SOULFORGE_STEEL,
                utils.spartanMatFromToolMat(SOULFORGE_STEEL, BWMItems.SOULFORGED_STEEL,
                        2565927, 7500402)));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) {


        Set<Item> item_set = new LinkedHashSet<>();
        for (BWMMatConverter mat : MATERIALS_TO_REGISTER){
            if (!ConfigHandler.disableKatana) {
                ItemSpartanBMKatana katana = new ItemSpartanBMKatana("katana_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(katana, new ResourceLocation(SpartanBM.MODID, "katana_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(katana);
            }
            if (!ConfigHandler.disableGreatsword) {
                ItemSpartanBMGreatsword greatsword = new ItemSpartanBMGreatsword("greatsword_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(greatsword, new ResourceLocation(SpartanBM.MODID, "greatsword_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(greatsword);
            }
            if (!ConfigHandler.disableLongsword) {
                ItemSpartanBMLongsword longsword = new ItemSpartanBMLongsword("longsword_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(longsword, new ResourceLocation(SpartanBM.MODID, "longsword_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(longsword);
            }
            if (!ConfigHandler.disableSaber) {
                ItemSpartanBMSaber saber = new ItemSpartanBMSaber("saber_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(saber, new ResourceLocation(SpartanBM.MODID, "saber_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(saber);
            }
            if (!ConfigHandler.disableRapier) {
                ItemSpartanBMRapier rapier = new ItemSpartanBMRapier("rapier_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(rapier, new ResourceLocation(SpartanBM.MODID, "rapier_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(rapier);
            }
            if (!ConfigHandler.disableDagger) {
                ItemSpartanBMDagger dagger = new ItemSpartanBMDagger("dagger_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(dagger, new ResourceLocation(SpartanBM.MODID, "dagger_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(dagger);
            }
            if (!ConfigHandler.disableSpear) {
                ItemSpartanBMSpear spear = new ItemSpartanBMSpear("spear_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(spear, new ResourceLocation(SpartanBM.MODID, "spear_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(spear);
            }
            if (!ConfigHandler.disablePike) {
                ItemSpartanBMPike pike = new ItemSpartanBMPike("pike_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(pike, new ResourceLocation(SpartanBM.MODID, "pike_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(pike);
            }
            if (!ConfigHandler.disableLance) {
                ItemSpartanBMLance lance = new ItemSpartanBMLance("lance_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(lance, new ResourceLocation(SpartanBM.MODID, "lance_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(lance);
            }
            if (!ConfigHandler.disableHalberd) {
                ItemSpartanBMHalberd halberd = new ItemSpartanBMHalberd("halberd_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(halberd, new ResourceLocation(SpartanBM.MODID, "halberd_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(halberd);
            }
            if (!ConfigHandler.disableWarhammer) {
                ItemSpartanBMWarhammer warhammer = new ItemSpartanBMWarhammer("warhammer_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(warhammer, new ResourceLocation(SpartanBM.MODID, "warhammer_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(warhammer);
            }
            if (!ConfigHandler.disableHammer) {
                ItemSpartanBMHammer hammer = new ItemSpartanBMHammer("hammer_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(hammer, new ResourceLocation(SpartanBM.MODID, "hammer_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(hammer);
            }
            if (!ConfigHandler.disableThrowingAxe) {
                ItemSpartanBMThrowingAxe throwing_axe = new ItemSpartanBMThrowingAxe("throwing_axe_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_axe, new ResourceLocation(SpartanBM.MODID, "throwing_axe_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(throwing_axe);
            }
            if (!ConfigHandler.disableThrowingKnife) {
                ItemSpartanBMThrowingKnife throwing_knife = new ItemSpartanBMThrowingKnife("throwing_knife_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(throwing_knife, new ResourceLocation(SpartanBM.MODID, "throwing_knife_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(throwing_knife);
            }
            if (!ConfigHandler.disableLongbow && !ConfigHandler.woodenLongbowOnly) {
                ItemSpartanBMLongbow longbow = new ItemSpartanBMLongbow("longbow_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(longbow, new ResourceLocation(SpartanBM.MODID, "longbow_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(longbow);
            }
            if (!ConfigHandler.disableCrossbow && !ConfigHandler.woodenCrossbowOnly) {
                ItemCrossbow crossbow = new ItemSpartanBMCrossbow("crossbow_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(crossbow, new ResourceLocation(SpartanBM.MODID, "crossbow_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(crossbow);
            }
            if (!ConfigHandler.disableJavelin) {
                ItemJavelin javelin = new ItemSpartanBMJavelin("javelin_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(javelin, new ResourceLocation(SpartanBM.MODID, "javelin_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(javelin);
            }
            if (!ConfigHandler.disableBattleaxe) {
                ItemBattleaxe battle_axe = new ItemSpartanBMBattleAxe("battle_axe_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(battle_axe, new ResourceLocation(SpartanBM.MODID, "battle_axe_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(battle_axe);
            }
            if (!ConfigHandler.disableBoomerang && !ConfigHandler.woodenBoomerangOnly) {
                ItemBoomerang boomerang = new ItemSpartanBMBoomerang("boomerang_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(boomerang, new ResourceLocation(SpartanBM.MODID, "boomerang_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(boomerang);
            }
            if (!ConfigHandler.disableMace) {
                ItemMace mace = new ItemSpartanBMMace("mace_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(mace, new ResourceLocation(SpartanBM.MODID, "mace_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(mace);
            }
            if (ConfigHandler.enableExperimentalWeapons && !ConfigHandler.disableParryingDagger){
                ItemParryingDagger parrying_dagger = new ItemSpartanBMParryingDagger("parrying_dagger_" + mat.getName(), mat);
                ModelRenderRegistry.addItemToRegistry(parrying_dagger, new ResourceLocation(SpartanBM.MODID, "parrying_dagger_custom"), utils.spartanMatFromMMDMat(mat));
                item_set.add(parrying_dagger);
            }

        }
        for (Item it : item_set){
            it.setCreativeTab(CreativeTabsSW.TAB_SW);
            ev.getRegistry().register(it);
        }
    }
}
