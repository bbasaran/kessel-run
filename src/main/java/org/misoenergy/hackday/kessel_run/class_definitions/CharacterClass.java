package org.misoenergy.hackday.kessel_run.class_definitions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class CharacterClass {
    private String name;
    private String summary;
    private String flavorText;
    private String creatingText;
    private String quickBuildText;
    private Map<Integer, LevelChanges> levelChanges; // ignoring levelChangesJson
    private int hitDiceDieType; // I don't think we need the enum one as well
    private String hitPointsAtFirstLevel;
    private String hitPointsAtHigherLevels;
    private int hitPointsAtFirstLevelNumber;
    private int hitPointsAtHigherLevelsNumber;
    private List<String> armorProficiencies; // ignoring armorProficienciesJson
    private List<String> weaponProficiencies; // ignoring weaponProficienciesJson
    private List<String> toolProficiencies; // ignoring toolProficienciesJson
    private List<String> toolProficienciesList; // ignoring toolProficienciesListJson
    private List<String> savingThrows; // ignoring savingThrowsJson
    private String skillChoices;
    private int numSkillChoices;
    private List<String> skillChoicesList; // ignoring skillChoicesListJson
    private List<String> equipmentLines; // ignoring equipmentLinesJson
    private String startingWealthVariant;
    private String classFeatureText;
    private String classFeatureText2;
    private String archetypeFlavorText;
    private String archetypeFlavorName;
    private String archetypes; // TODO unsure if this is a string or a separate type
    private List<String> imageUrls; // ignoring imageUrlsJson
    private long casterRatio;
    private String casterType; // ignoring casterTypeEnum
    private List<String> multiClassProficiencies; // ignoring multiClassProficienciesJson
    private String features; // TODO unsure if this is a string or a separate type
    private String featureRowKeys; // ignoring featureRowKeysJson
    private String contentType; // ignoring contentTypeEnum
    private String contentSource; // ignoring contentSourceEnum
    private String partitionKey;
    private String rowKey;
    // ignoring timestamp and eTag
}
