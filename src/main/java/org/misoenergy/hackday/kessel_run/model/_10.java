
package org.misoenergy.hackday.kessel_run.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Level",
    "Proficiency Bonus",
    "Features",
    "Rages",
    "Rage Damage",
    "Berserker Instincts",
    "Force Powers Known",
    "Force Points",
    "Max Power Level",
    "Force-Empowered Casting Options",
    "Tech Powers Known",
    "Tech Points",
    "Potent Aptitude",
    "Modification Slots",
    "Maneuvers Known",
    "Superiority Dice Quantity",
    "Superiority Dice Size",
    "Strategies Known",
    "Focused Strikes",
    "Auras Known",
    "Aura Radius",
    "Martial Arts",
    "Focus Points",
    "Monastic Vows",
    "Unarmored Movement",
    "Sneak Attack",
    "Operative Exploits",
    "Discoveries",
    "Ranger's Quarry",
    "Routines Known",
    "Routine Radius",
    "Kinetic Combat",
    "Ideals Known",
    "Ideal Manifests"
})
@Generated("jsonschema2pojo")
public class _10 {

    @JsonProperty("Level")
    private String level;
    @JsonProperty("Proficiency Bonus")
    private String proficiencyBonus;
    @JsonProperty("Features")
    private String features;
    @JsonProperty("Rages")
    private String rages;
    @JsonProperty("Rage Damage")
    private String rageDamage;
    @JsonProperty("Berserker Instincts")
    private String berserkerInstincts;
    @JsonProperty("Force Powers Known")
    private String forcePowersKnown;
    @JsonProperty("Force Points")
    private String forcePoints;
    @JsonProperty("Max Power Level")
    private String maxPowerLevel;
    @JsonProperty("Force-Empowered Casting Options")
    private String forceEmpoweredCastingOptions;
    @JsonProperty("Tech Powers Known")
    private String techPowersKnown;
    @JsonProperty("Tech Points")
    private String techPoints;
    @JsonProperty("Potent Aptitude")
    private String potentAptitude;
    @JsonProperty("Modification Slots")
    private String modificationSlots;
    @JsonProperty("Maneuvers Known")
    private String maneuversKnown;
    @JsonProperty("Superiority Dice Quantity")
    private String superiorityDiceQuantity;
    @JsonProperty("Superiority Dice Size")
    private String superiorityDiceSize;
    @JsonProperty("Strategies Known")
    private String strategiesKnown;
    @JsonProperty("Focused Strikes")
    private String focusedStrikes;
    @JsonProperty("Auras Known")
    private String aurasKnown;
    @JsonProperty("Aura Radius")
    private String auraRadius;
    @JsonProperty("Martial Arts")
    private String martialArts;
    @JsonProperty("Focus Points")
    private String focusPoints;
    @JsonProperty("Monastic Vows")
    private String monasticVows;
    @JsonProperty("Unarmored Movement")
    private String unarmoredMovement;
    @JsonProperty("Sneak Attack")
    private String sneakAttack;
    @JsonProperty("Operative Exploits")
    private String operativeExploits;
    @JsonProperty("Discoveries")
    private String discoveries;
    @JsonProperty("Ranger's Quarry")
    private String rangerSQuarry;
    @JsonProperty("Routines Known")
    private String routinesKnown;
    @JsonProperty("Routine Radius")
    private String routineRadius;
    @JsonProperty("Kinetic Combat")
    private String kineticCombat;
    @JsonProperty("Ideals Known")
    private String idealsKnown;
    @JsonProperty("Ideal Manifests")
    private String idealManifests;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(String level) {
        this.level = level;
    }

    public _10 withLevel(String level) {
        this.level = level;
        return this;
    }

    @JsonProperty("Proficiency Bonus")
    public String getProficiencyBonus() {
        return proficiencyBonus;
    }

    @JsonProperty("Proficiency Bonus")
    public void setProficiencyBonus(String proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public _10 withProficiencyBonus(String proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
        return this;
    }

    @JsonProperty("Features")
    public String getFeatures() {
        return features;
    }

    @JsonProperty("Features")
    public void setFeatures(String features) {
        this.features = features;
    }

    public _10 withFeatures(String features) {
        this.features = features;
        return this;
    }

    @JsonProperty("Rages")
    public String getRages() {
        return rages;
    }

    @JsonProperty("Rages")
    public void setRages(String rages) {
        this.rages = rages;
    }

    public _10 withRages(String rages) {
        this.rages = rages;
        return this;
    }

    @JsonProperty("Rage Damage")
    public String getRageDamage() {
        return rageDamage;
    }

    @JsonProperty("Rage Damage")
    public void setRageDamage(String rageDamage) {
        this.rageDamage = rageDamage;
    }

    public _10 withRageDamage(String rageDamage) {
        this.rageDamage = rageDamage;
        return this;
    }

    @JsonProperty("Berserker Instincts")
    public String getBerserkerInstincts() {
        return berserkerInstincts;
    }

    @JsonProperty("Berserker Instincts")
    public void setBerserkerInstincts(String berserkerInstincts) {
        this.berserkerInstincts = berserkerInstincts;
    }

    public _10 withBerserkerInstincts(String berserkerInstincts) {
        this.berserkerInstincts = berserkerInstincts;
        return this;
    }

    @JsonProperty("Force Powers Known")
    public String getForcePowersKnown() {
        return forcePowersKnown;
    }

    @JsonProperty("Force Powers Known")
    public void setForcePowersKnown(String forcePowersKnown) {
        this.forcePowersKnown = forcePowersKnown;
    }

    public _10 withForcePowersKnown(String forcePowersKnown) {
        this.forcePowersKnown = forcePowersKnown;
        return this;
    }

    @JsonProperty("Force Points")
    public String getForcePoints() {
        return forcePoints;
    }

    @JsonProperty("Force Points")
    public void setForcePoints(String forcePoints) {
        this.forcePoints = forcePoints;
    }

    public _10 withForcePoints(String forcePoints) {
        this.forcePoints = forcePoints;
        return this;
    }

    @JsonProperty("Max Power Level")
    public String getMaxPowerLevel() {
        return maxPowerLevel;
    }

    @JsonProperty("Max Power Level")
    public void setMaxPowerLevel(String maxPowerLevel) {
        this.maxPowerLevel = maxPowerLevel;
    }

    public _10 withMaxPowerLevel(String maxPowerLevel) {
        this.maxPowerLevel = maxPowerLevel;
        return this;
    }

    @JsonProperty("Force-Empowered Casting Options")
    public String getForceEmpoweredCastingOptions() {
        return forceEmpoweredCastingOptions;
    }

    @JsonProperty("Force-Empowered Casting Options")
    public void setForceEmpoweredCastingOptions(String forceEmpoweredCastingOptions) {
        this.forceEmpoweredCastingOptions = forceEmpoweredCastingOptions;
    }

    public _10 withForceEmpoweredCastingOptions(String forceEmpoweredCastingOptions) {
        this.forceEmpoweredCastingOptions = forceEmpoweredCastingOptions;
        return this;
    }

    @JsonProperty("Tech Powers Known")
    public String getTechPowersKnown() {
        return techPowersKnown;
    }

    @JsonProperty("Tech Powers Known")
    public void setTechPowersKnown(String techPowersKnown) {
        this.techPowersKnown = techPowersKnown;
    }

    public _10 withTechPowersKnown(String techPowersKnown) {
        this.techPowersKnown = techPowersKnown;
        return this;
    }

    @JsonProperty("Tech Points")
    public String getTechPoints() {
        return techPoints;
    }

    @JsonProperty("Tech Points")
    public void setTechPoints(String techPoints) {
        this.techPoints = techPoints;
    }

    public _10 withTechPoints(String techPoints) {
        this.techPoints = techPoints;
        return this;
    }

    @JsonProperty("Potent Aptitude")
    public String getPotentAptitude() {
        return potentAptitude;
    }

    @JsonProperty("Potent Aptitude")
    public void setPotentAptitude(String potentAptitude) {
        this.potentAptitude = potentAptitude;
    }

    public _10 withPotentAptitude(String potentAptitude) {
        this.potentAptitude = potentAptitude;
        return this;
    }

    @JsonProperty("Modification Slots")
    public String getModificationSlots() {
        return modificationSlots;
    }

    @JsonProperty("Modification Slots")
    public void setModificationSlots(String modificationSlots) {
        this.modificationSlots = modificationSlots;
    }

    public _10 withModificationSlots(String modificationSlots) {
        this.modificationSlots = modificationSlots;
        return this;
    }

    @JsonProperty("Maneuvers Known")
    public String getManeuversKnown() {
        return maneuversKnown;
    }

    @JsonProperty("Maneuvers Known")
    public void setManeuversKnown(String maneuversKnown) {
        this.maneuversKnown = maneuversKnown;
    }

    public _10 withManeuversKnown(String maneuversKnown) {
        this.maneuversKnown = maneuversKnown;
        return this;
    }

    @JsonProperty("Superiority Dice Quantity")
    public String getSuperiorityDiceQuantity() {
        return superiorityDiceQuantity;
    }

    @JsonProperty("Superiority Dice Quantity")
    public void setSuperiorityDiceQuantity(String superiorityDiceQuantity) {
        this.superiorityDiceQuantity = superiorityDiceQuantity;
    }

    public _10 withSuperiorityDiceQuantity(String superiorityDiceQuantity) {
        this.superiorityDiceQuantity = superiorityDiceQuantity;
        return this;
    }

    @JsonProperty("Superiority Dice Size")
    public String getSuperiorityDiceSize() {
        return superiorityDiceSize;
    }

    @JsonProperty("Superiority Dice Size")
    public void setSuperiorityDiceSize(String superiorityDiceSize) {
        this.superiorityDiceSize = superiorityDiceSize;
    }

    public _10 withSuperiorityDiceSize(String superiorityDiceSize) {
        this.superiorityDiceSize = superiorityDiceSize;
        return this;
    }

    @JsonProperty("Strategies Known")
    public String getStrategiesKnown() {
        return strategiesKnown;
    }

    @JsonProperty("Strategies Known")
    public void setStrategiesKnown(String strategiesKnown) {
        this.strategiesKnown = strategiesKnown;
    }

    public _10 withStrategiesKnown(String strategiesKnown) {
        this.strategiesKnown = strategiesKnown;
        return this;
    }

    @JsonProperty("Focused Strikes")
    public String getFocusedStrikes() {
        return focusedStrikes;
    }

    @JsonProperty("Focused Strikes")
    public void setFocusedStrikes(String focusedStrikes) {
        this.focusedStrikes = focusedStrikes;
    }

    public _10 withFocusedStrikes(String focusedStrikes) {
        this.focusedStrikes = focusedStrikes;
        return this;
    }

    @JsonProperty("Auras Known")
    public String getAurasKnown() {
        return aurasKnown;
    }

    @JsonProperty("Auras Known")
    public void setAurasKnown(String aurasKnown) {
        this.aurasKnown = aurasKnown;
    }

    public _10 withAurasKnown(String aurasKnown) {
        this.aurasKnown = aurasKnown;
        return this;
    }

    @JsonProperty("Aura Radius")
    public String getAuraRadius() {
        return auraRadius;
    }

    @JsonProperty("Aura Radius")
    public void setAuraRadius(String auraRadius) {
        this.auraRadius = auraRadius;
    }

    public _10 withAuraRadius(String auraRadius) {
        this.auraRadius = auraRadius;
        return this;
    }

    @JsonProperty("Martial Arts")
    public String getMartialArts() {
        return martialArts;
    }

    @JsonProperty("Martial Arts")
    public void setMartialArts(String martialArts) {
        this.martialArts = martialArts;
    }

    public _10 withMartialArts(String martialArts) {
        this.martialArts = martialArts;
        return this;
    }

    @JsonProperty("Focus Points")
    public String getFocusPoints() {
        return focusPoints;
    }

    @JsonProperty("Focus Points")
    public void setFocusPoints(String focusPoints) {
        this.focusPoints = focusPoints;
    }

    public _10 withFocusPoints(String focusPoints) {
        this.focusPoints = focusPoints;
        return this;
    }

    @JsonProperty("Monastic Vows")
    public String getMonasticVows() {
        return monasticVows;
    }

    @JsonProperty("Monastic Vows")
    public void setMonasticVows(String monasticVows) {
        this.monasticVows = monasticVows;
    }

    public _10 withMonasticVows(String monasticVows) {
        this.monasticVows = monasticVows;
        return this;
    }

    @JsonProperty("Unarmored Movement")
    public String getUnarmoredMovement() {
        return unarmoredMovement;
    }

    @JsonProperty("Unarmored Movement")
    public void setUnarmoredMovement(String unarmoredMovement) {
        this.unarmoredMovement = unarmoredMovement;
    }

    public _10 withUnarmoredMovement(String unarmoredMovement) {
        this.unarmoredMovement = unarmoredMovement;
        return this;
    }

    @JsonProperty("Sneak Attack")
    public String getSneakAttack() {
        return sneakAttack;
    }

    @JsonProperty("Sneak Attack")
    public void setSneakAttack(String sneakAttack) {
        this.sneakAttack = sneakAttack;
    }

    public _10 withSneakAttack(String sneakAttack) {
        this.sneakAttack = sneakAttack;
        return this;
    }

    @JsonProperty("Operative Exploits")
    public String getOperativeExploits() {
        return operativeExploits;
    }

    @JsonProperty("Operative Exploits")
    public void setOperativeExploits(String operativeExploits) {
        this.operativeExploits = operativeExploits;
    }

    public _10 withOperativeExploits(String operativeExploits) {
        this.operativeExploits = operativeExploits;
        return this;
    }

    @JsonProperty("Discoveries")
    public String getDiscoveries() {
        return discoveries;
    }

    @JsonProperty("Discoveries")
    public void setDiscoveries(String discoveries) {
        this.discoveries = discoveries;
    }

    public _10 withDiscoveries(String discoveries) {
        this.discoveries = discoveries;
        return this;
    }

    @JsonProperty("Ranger's Quarry")
    public String getRangerSQuarry() {
        return rangerSQuarry;
    }

    @JsonProperty("Ranger's Quarry")
    public void setRangerSQuarry(String rangerSQuarry) {
        this.rangerSQuarry = rangerSQuarry;
    }

    public _10 withRangerSQuarry(String rangerSQuarry) {
        this.rangerSQuarry = rangerSQuarry;
        return this;
    }

    @JsonProperty("Routines Known")
    public String getRoutinesKnown() {
        return routinesKnown;
    }

    @JsonProperty("Routines Known")
    public void setRoutinesKnown(String routinesKnown) {
        this.routinesKnown = routinesKnown;
    }

    public _10 withRoutinesKnown(String routinesKnown) {
        this.routinesKnown = routinesKnown;
        return this;
    }

    @JsonProperty("Routine Radius")
    public String getRoutineRadius() {
        return routineRadius;
    }

    @JsonProperty("Routine Radius")
    public void setRoutineRadius(String routineRadius) {
        this.routineRadius = routineRadius;
    }

    public _10 withRoutineRadius(String routineRadius) {
        this.routineRadius = routineRadius;
        return this;
    }

    @JsonProperty("Kinetic Combat")
    public String getKineticCombat() {
        return kineticCombat;
    }

    @JsonProperty("Kinetic Combat")
    public void setKineticCombat(String kineticCombat) {
        this.kineticCombat = kineticCombat;
    }

    public _10 withKineticCombat(String kineticCombat) {
        this.kineticCombat = kineticCombat;
        return this;
    }

    @JsonProperty("Ideals Known")
    public String getIdealsKnown() {
        return idealsKnown;
    }

    @JsonProperty("Ideals Known")
    public void setIdealsKnown(String idealsKnown) {
        this.idealsKnown = idealsKnown;
    }

    public _10 withIdealsKnown(String idealsKnown) {
        this.idealsKnown = idealsKnown;
        return this;
    }

    @JsonProperty("Ideal Manifests")
    public String getIdealManifests() {
        return idealManifests;
    }

    @JsonProperty("Ideal Manifests")
    public void setIdealManifests(String idealManifests) {
        this.idealManifests = idealManifests;
    }

    public _10 withIdealManifests(String idealManifests) {
        this.idealManifests = idealManifests;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public _10 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_10 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("proficiencyBonus");
        sb.append('=');
        sb.append(((this.proficiencyBonus == null)?"<null>":this.proficiencyBonus));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("rages");
        sb.append('=');
        sb.append(((this.rages == null)?"<null>":this.rages));
        sb.append(',');
        sb.append("rageDamage");
        sb.append('=');
        sb.append(((this.rageDamage == null)?"<null>":this.rageDamage));
        sb.append(',');
        sb.append("berserkerInstincts");
        sb.append('=');
        sb.append(((this.berserkerInstincts == null)?"<null>":this.berserkerInstincts));
        sb.append(',');
        sb.append("forcePowersKnown");
        sb.append('=');
        sb.append(((this.forcePowersKnown == null)?"<null>":this.forcePowersKnown));
        sb.append(',');
        sb.append("forcePoints");
        sb.append('=');
        sb.append(((this.forcePoints == null)?"<null>":this.forcePoints));
        sb.append(',');
        sb.append("maxPowerLevel");
        sb.append('=');
        sb.append(((this.maxPowerLevel == null)?"<null>":this.maxPowerLevel));
        sb.append(',');
        sb.append("forceEmpoweredCastingOptions");
        sb.append('=');
        sb.append(((this.forceEmpoweredCastingOptions == null)?"<null>":this.forceEmpoweredCastingOptions));
        sb.append(',');
        sb.append("techPowersKnown");
        sb.append('=');
        sb.append(((this.techPowersKnown == null)?"<null>":this.techPowersKnown));
        sb.append(',');
        sb.append("techPoints");
        sb.append('=');
        sb.append(((this.techPoints == null)?"<null>":this.techPoints));
        sb.append(',');
        sb.append("potentAptitude");
        sb.append('=');
        sb.append(((this.potentAptitude == null)?"<null>":this.potentAptitude));
        sb.append(',');
        sb.append("modificationSlots");
        sb.append('=');
        sb.append(((this.modificationSlots == null)?"<null>":this.modificationSlots));
        sb.append(',');
        sb.append("maneuversKnown");
        sb.append('=');
        sb.append(((this.maneuversKnown == null)?"<null>":this.maneuversKnown));
        sb.append(',');
        sb.append("superiorityDiceQuantity");
        sb.append('=');
        sb.append(((this.superiorityDiceQuantity == null)?"<null>":this.superiorityDiceQuantity));
        sb.append(',');
        sb.append("superiorityDiceSize");
        sb.append('=');
        sb.append(((this.superiorityDiceSize == null)?"<null>":this.superiorityDiceSize));
        sb.append(',');
        sb.append("strategiesKnown");
        sb.append('=');
        sb.append(((this.strategiesKnown == null)?"<null>":this.strategiesKnown));
        sb.append(',');
        sb.append("focusedStrikes");
        sb.append('=');
        sb.append(((this.focusedStrikes == null)?"<null>":this.focusedStrikes));
        sb.append(',');
        sb.append("aurasKnown");
        sb.append('=');
        sb.append(((this.aurasKnown == null)?"<null>":this.aurasKnown));
        sb.append(',');
        sb.append("auraRadius");
        sb.append('=');
        sb.append(((this.auraRadius == null)?"<null>":this.auraRadius));
        sb.append(',');
        sb.append("martialArts");
        sb.append('=');
        sb.append(((this.martialArts == null)?"<null>":this.martialArts));
        sb.append(',');
        sb.append("focusPoints");
        sb.append('=');
        sb.append(((this.focusPoints == null)?"<null>":this.focusPoints));
        sb.append(',');
        sb.append("monasticVows");
        sb.append('=');
        sb.append(((this.monasticVows == null)?"<null>":this.monasticVows));
        sb.append(',');
        sb.append("unarmoredMovement");
        sb.append('=');
        sb.append(((this.unarmoredMovement == null)?"<null>":this.unarmoredMovement));
        sb.append(',');
        sb.append("sneakAttack");
        sb.append('=');
        sb.append(((this.sneakAttack == null)?"<null>":this.sneakAttack));
        sb.append(',');
        sb.append("operativeExploits");
        sb.append('=');
        sb.append(((this.operativeExploits == null)?"<null>":this.operativeExploits));
        sb.append(',');
        sb.append("discoveries");
        sb.append('=');
        sb.append(((this.discoveries == null)?"<null>":this.discoveries));
        sb.append(',');
        sb.append("rangerSQuarry");
        sb.append('=');
        sb.append(((this.rangerSQuarry == null)?"<null>":this.rangerSQuarry));
        sb.append(',');
        sb.append("routinesKnown");
        sb.append('=');
        sb.append(((this.routinesKnown == null)?"<null>":this.routinesKnown));
        sb.append(',');
        sb.append("routineRadius");
        sb.append('=');
        sb.append(((this.routineRadius == null)?"<null>":this.routineRadius));
        sb.append(',');
        sb.append("kineticCombat");
        sb.append('=');
        sb.append(((this.kineticCombat == null)?"<null>":this.kineticCombat));
        sb.append(',');
        sb.append("idealsKnown");
        sb.append('=');
        sb.append(((this.idealsKnown == null)?"<null>":this.idealsKnown));
        sb.append(',');
        sb.append("idealManifests");
        sb.append('=');
        sb.append(((this.idealManifests == null)?"<null>":this.idealManifests));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.superiorityDiceQuantity == null)? 0 :this.superiorityDiceQuantity.hashCode()));
        result = ((result* 31)+((this.forceEmpoweredCastingOptions == null)? 0 :this.forceEmpoweredCastingOptions.hashCode()));
        result = ((result* 31)+((this.kineticCombat == null)? 0 :this.kineticCombat.hashCode()));
        result = ((result* 31)+((this.forcePoints == null)? 0 :this.forcePoints.hashCode()));
        result = ((result* 31)+((this.potentAptitude == null)? 0 :this.potentAptitude.hashCode()));
        result = ((result* 31)+((this.auraRadius == null)? 0 :this.auraRadius.hashCode()));
        result = ((result* 31)+((this.proficiencyBonus == null)? 0 :this.proficiencyBonus.hashCode()));
        result = ((result* 31)+((this.maneuversKnown == null)? 0 :this.maneuversKnown.hashCode()));
        result = ((result* 31)+((this.monasticVows == null)? 0 :this.monasticVows.hashCode()));
        result = ((result* 31)+((this.techPowersKnown == null)? 0 :this.techPowersKnown.hashCode()));
        result = ((result* 31)+((this.focusPoints == null)? 0 :this.focusPoints.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.maxPowerLevel == null)? 0 :this.maxPowerLevel.hashCode()));
        result = ((result* 31)+((this.berserkerInstincts == null)? 0 :this.berserkerInstincts.hashCode()));
        result = ((result* 31)+((this.aurasKnown == null)? 0 :this.aurasKnown.hashCode()));
        result = ((result* 31)+((this.rangerSQuarry == null)? 0 :this.rangerSQuarry.hashCode()));
        result = ((result* 31)+((this.idealManifests == null)? 0 :this.idealManifests.hashCode()));
        result = ((result* 31)+((this.focusedStrikes == null)? 0 :this.focusedStrikes.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        result = ((result* 31)+((this.operativeExploits == null)? 0 :this.operativeExploits.hashCode()));
        result = ((result* 31)+((this.sneakAttack == null)? 0 :this.sneakAttack.hashCode()));
        result = ((result* 31)+((this.idealsKnown == null)? 0 :this.idealsKnown.hashCode()));
        result = ((result* 31)+((this.strategiesKnown == null)? 0 :this.strategiesKnown.hashCode()));
        result = ((result* 31)+((this.techPoints == null)? 0 :this.techPoints.hashCode()));
        result = ((result* 31)+((this.rages == null)? 0 :this.rages.hashCode()));
        result = ((result* 31)+((this.routinesKnown == null)? 0 :this.routinesKnown.hashCode()));
        result = ((result* 31)+((this.unarmoredMovement == null)? 0 :this.unarmoredMovement.hashCode()));
        result = ((result* 31)+((this.martialArts == null)? 0 :this.martialArts.hashCode()));
        result = ((result* 31)+((this.discoveries == null)? 0 :this.discoveries.hashCode()));
        result = ((result* 31)+((this.rageDamage == null)? 0 :this.rageDamage.hashCode()));
        result = ((result* 31)+((this.modificationSlots == null)? 0 :this.modificationSlots.hashCode()));
        result = ((result* 31)+((this.superiorityDiceSize == null)? 0 :this.superiorityDiceSize.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.routineRadius == null)? 0 :this.routineRadius.hashCode()));
        result = ((result* 31)+((this.forcePowersKnown == null)? 0 :this.forcePowersKnown.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof _10) == false) {
            return false;
        }
        _10 rhs = ((_10) other);
        return ((((((((((((((((((((((((((((((((((((this.superiorityDiceQuantity == rhs.superiorityDiceQuantity)||((this.superiorityDiceQuantity!= null)&&this.superiorityDiceQuantity.equals(rhs.superiorityDiceQuantity)))&&((this.forceEmpoweredCastingOptions == rhs.forceEmpoweredCastingOptions)||((this.forceEmpoweredCastingOptions!= null)&&this.forceEmpoweredCastingOptions.equals(rhs.forceEmpoweredCastingOptions))))&&((this.kineticCombat == rhs.kineticCombat)||((this.kineticCombat!= null)&&this.kineticCombat.equals(rhs.kineticCombat))))&&((this.forcePoints == rhs.forcePoints)||((this.forcePoints!= null)&&this.forcePoints.equals(rhs.forcePoints))))&&((this.potentAptitude == rhs.potentAptitude)||((this.potentAptitude!= null)&&this.potentAptitude.equals(rhs.potentAptitude))))&&((this.auraRadius == rhs.auraRadius)||((this.auraRadius!= null)&&this.auraRadius.equals(rhs.auraRadius))))&&((this.proficiencyBonus == rhs.proficiencyBonus)||((this.proficiencyBonus!= null)&&this.proficiencyBonus.equals(rhs.proficiencyBonus))))&&((this.maneuversKnown == rhs.maneuversKnown)||((this.maneuversKnown!= null)&&this.maneuversKnown.equals(rhs.maneuversKnown))))&&((this.monasticVows == rhs.monasticVows)||((this.monasticVows!= null)&&this.monasticVows.equals(rhs.monasticVows))))&&((this.techPowersKnown == rhs.techPowersKnown)||((this.techPowersKnown!= null)&&this.techPowersKnown.equals(rhs.techPowersKnown))))&&((this.focusPoints == rhs.focusPoints)||((this.focusPoints!= null)&&this.focusPoints.equals(rhs.focusPoints))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.maxPowerLevel == rhs.maxPowerLevel)||((this.maxPowerLevel!= null)&&this.maxPowerLevel.equals(rhs.maxPowerLevel))))&&((this.berserkerInstincts == rhs.berserkerInstincts)||((this.berserkerInstincts!= null)&&this.berserkerInstincts.equals(rhs.berserkerInstincts))))&&((this.aurasKnown == rhs.aurasKnown)||((this.aurasKnown!= null)&&this.aurasKnown.equals(rhs.aurasKnown))))&&((this.rangerSQuarry == rhs.rangerSQuarry)||((this.rangerSQuarry!= null)&&this.rangerSQuarry.equals(rhs.rangerSQuarry))))&&((this.idealManifests == rhs.idealManifests)||((this.idealManifests!= null)&&this.idealManifests.equals(rhs.idealManifests))))&&((this.focusedStrikes == rhs.focusedStrikes)||((this.focusedStrikes!= null)&&this.focusedStrikes.equals(rhs.focusedStrikes))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))))&&((this.operativeExploits == rhs.operativeExploits)||((this.operativeExploits!= null)&&this.operativeExploits.equals(rhs.operativeExploits))))&&((this.sneakAttack == rhs.sneakAttack)||((this.sneakAttack!= null)&&this.sneakAttack.equals(rhs.sneakAttack))))&&((this.idealsKnown == rhs.idealsKnown)||((this.idealsKnown!= null)&&this.idealsKnown.equals(rhs.idealsKnown))))&&((this.strategiesKnown == rhs.strategiesKnown)||((this.strategiesKnown!= null)&&this.strategiesKnown.equals(rhs.strategiesKnown))))&&((this.techPoints == rhs.techPoints)||((this.techPoints!= null)&&this.techPoints.equals(rhs.techPoints))))&&((this.rages == rhs.rages)||((this.rages!= null)&&this.rages.equals(rhs.rages))))&&((this.routinesKnown == rhs.routinesKnown)||((this.routinesKnown!= null)&&this.routinesKnown.equals(rhs.routinesKnown))))&&((this.unarmoredMovement == rhs.unarmoredMovement)||((this.unarmoredMovement!= null)&&this.unarmoredMovement.equals(rhs.unarmoredMovement))))&&((this.martialArts == rhs.martialArts)||((this.martialArts!= null)&&this.martialArts.equals(rhs.martialArts))))&&((this.discoveries == rhs.discoveries)||((this.discoveries!= null)&&this.discoveries.equals(rhs.discoveries))))&&((this.rageDamage == rhs.rageDamage)||((this.rageDamage!= null)&&this.rageDamage.equals(rhs.rageDamage))))&&((this.modificationSlots == rhs.modificationSlots)||((this.modificationSlots!= null)&&this.modificationSlots.equals(rhs.modificationSlots))))&&((this.superiorityDiceSize == rhs.superiorityDiceSize)||((this.superiorityDiceSize!= null)&&this.superiorityDiceSize.equals(rhs.superiorityDiceSize))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.routineRadius == rhs.routineRadius)||((this.routineRadius!= null)&&this.routineRadius.equals(rhs.routineRadius))))&&((this.forcePowersKnown == rhs.forcePowersKnown)||((this.forcePowersKnown!= null)&&this.forcePowersKnown.equals(rhs.forcePowersKnown))));
    }

}
