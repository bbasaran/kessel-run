package org.misoenergy.hackday.kessel_run.class_definitions;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelChanges {

    @JsonProperty("Aura Radius")
    private String auraRadius;

    @JsonProperty("Auras Known")
    private String aurasKnown;

    @JsonProperty("Berserker Instincts")
    private String berserkerInstincts;

    @JsonProperty("Discoveries")
    private String discoveries;

    @JsonProperty("Features")
    private String features;

    @JsonProperty("Focus Points")
    private String focusPoints;

    @JsonProperty("Focused Strikes")
    private String focusedStrikes;

    @JsonProperty("Force-Empowered Casting Options")
    private String forceEmpoweredCastingOptions;

    @JsonProperty("Force Points")
    private String forcePoints;

    @JsonProperty("Force Powers Known")
    private String forcePowersKnown;

    @JsonProperty("Ideal Manifests")
    private String idealManifests;

    @JsonProperty("Ideals Known")
    private String idealsKnown;

    @JsonProperty("Kinetic Combat")
    private String kineticCombat;

    @JsonProperty("Level")
    private String level;

    @JsonProperty("Maneuvers Known")
    private String maneuversKnown;

    @JsonProperty("Martial Arts")
    private String martialArts;

    @JsonProperty("Max Power Level")
    private String maxPowerLevel;

    @JsonProperty("Modification Slots")
    private String modificationSlots;

    @JsonProperty("Monastic Vows")
    private String monasticVows;

    @JsonProperty("Operative Exploits")
    private String operativeExploits;

    @JsonProperty("Potent Aptitude")
    private String potentAptitude;

    @JsonProperty("Proficiency Bonus")
    private String proficiencyBonus;

    @JsonProperty("Rage Damage")
    private String rageDamage;

    @JsonProperty("Rages")
    private String rages;

    @JsonProperty("Ranger's Quarry")
    private String rangersQuarry;

    @JsonProperty("Routine Radius")
    private String routineRadius;

    @JsonProperty("Routines Known")
    private String routinesKnown;

    @JsonProperty("Sneak Attack")
    private String sneakAttack;

    @JsonProperty("Strategies Known")
    private String strategiesKnown;

    @JsonProperty("Superiority Dice Quantity")
    private String superiorityDiceQuantity;

    @JsonProperty("Superiority Dice Size")
    private String superiorityDiceSize;

    @JsonProperty("Tech Points")
    private String techPoints;

    @JsonProperty("Tech Powers Known")
    private String techPowersKnown;

    @JsonProperty("Unarmored Movement")
    private String unarmoredMovement;
}
