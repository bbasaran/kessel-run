
package org.misoenergy.hackday.kessel_run.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "summary",
    "primaryAbility",
    "flavorText",
    "creatingText",
    "quickBuildText",
    "levelChangeHeadersJson",
    "levelChanges",
    "levelChangesJson",
    "hitDiceDieTypeEnum",
    "hitDiceDieType",
    "hitPointsAtFirstLevel",
    "hitPointsAtHigherLevels",
    "hitPointsAtFirstLevelNumber",
    "hitPointsAtHigherLevelsNumber",
    "armorProficiencies",
    "armorProficienciesJson",
    "weaponProficiencies",
    "weaponProficienciesJson",
    "toolProficiencies",
    "toolProficienciesJson",
    "toolProficienciesList",
    "toolProficienciesListJson",
    "savingThrows",
    "savingThrowsJson",
    "skillChoices",
    "numSkillChoices",
    "skillChoicesList",
    "skillChoicesListJson",
    "equipmentLines",
    "equipmentLinesJson",
    "startingWealthVariant",
    "classFeatureText",
    "classFeatureText2",
    "archetypeFlavorText",
    "archetypeFlavorName",
    "archetypes",
    "imageUrls",
    "imageUrlsJson",
    "casterRatio",
    "casterTypeEnum",
    "casterType",
    "multiClassProficiencies",
    "multiClassProficienciesJson",
    "features",
    "featureRowKeys",
    "featureRowKeysJson",
    "contentTypeEnum",
    "contentType",
    "contentSourceEnum",
    "contentSource",
    "partitionKey",
    "rowKey",
    "timestamp",
    "eTag"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StarWarsPojo {

    @JsonProperty("name")
    private String name;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("primaryAbility")
    private String primaryAbility;
    @JsonProperty("flavorText")
    private String flavorText;
    @JsonProperty("creatingText")
    private String creatingText;
    @JsonProperty("quickBuildText")
    private String quickBuildText;
    @JsonProperty("levelChangeHeadersJson")
    private String levelChangeHeadersJson;
    @JsonProperty("levelChanges")
    private LevelChanges levelChanges;
    @JsonProperty("levelChangesJson")
    private String levelChangesJson;
    @JsonProperty("hitDiceDieTypeEnum")
    private Integer hitDiceDieTypeEnum;
    @JsonProperty("hitDiceDieType")
    private Integer hitDiceDieType;
    @JsonProperty("hitPointsAtFirstLevel")
    private String hitPointsAtFirstLevel;
    @JsonProperty("hitPointsAtHigherLevels")
    private String hitPointsAtHigherLevels;
    @JsonProperty("hitPointsAtFirstLevelNumber")
    private Integer hitPointsAtFirstLevelNumber;
    @JsonProperty("hitPointsAtHigherLevelsNumber")
    private Integer hitPointsAtHigherLevelsNumber;
    @JsonProperty("armorProficiencies")
    private List<String> armorProficiencies = new ArrayList<String>();
    @JsonProperty("armorProficienciesJson")
    private String armorProficienciesJson;
    @JsonProperty("weaponProficiencies")
    private List<String> weaponProficiencies = new ArrayList<String>();
    @JsonProperty("weaponProficienciesJson")
    private String weaponProficienciesJson;
    @JsonProperty("toolProficiencies")
    private List<String> toolProficiencies = new ArrayList<String>();
    @JsonProperty("toolProficienciesJson")
    private String toolProficienciesJson;
    @JsonProperty("toolProficienciesList")
    private List<String> toolProficienciesList = new ArrayList<String>();
    @JsonProperty("toolProficienciesListJson")
    private String toolProficienciesListJson;
    @JsonProperty("savingThrows")
    private List<String> savingThrows = new ArrayList<String>();
    @JsonProperty("savingThrowsJson")
    private String savingThrowsJson;
    @JsonProperty("skillChoices")
    private String skillChoices;
    @JsonProperty("numSkillChoices")
    private Integer numSkillChoices;
    @JsonProperty("skillChoicesList")
    private List<String> skillChoicesList = new ArrayList<String>();
    @JsonProperty("skillChoicesListJson")
    private String skillChoicesListJson;
    @JsonProperty("equipmentLines")
    private List<String> equipmentLines = new ArrayList<String>();
    @JsonProperty("equipmentLinesJson")
    private String equipmentLinesJson;
    @JsonProperty("startingWealthVariant")
    private String startingWealthVariant;
    @JsonProperty("classFeatureText")
    private String classFeatureText;
    @JsonProperty("classFeatureText2")
    private Object classFeatureText2;
    @JsonProperty("archetypeFlavorText")
    private String archetypeFlavorText;
    @JsonProperty("archetypeFlavorName")
    private String archetypeFlavorName;
    @JsonProperty("archetypes")
    private Object archetypes;
    @JsonProperty("imageUrls")
    private List<String> imageUrls = new ArrayList<String>();
    @JsonProperty("imageUrlsJson")
    private String imageUrlsJson;
    @JsonProperty("casterRatio")
    private Double casterRatio;
    @JsonProperty("casterTypeEnum")
    private Integer casterTypeEnum;
    @JsonProperty("casterType")
    private String casterType;
    @JsonProperty("multiClassProficiencies")
    private List<String> multiClassProficiencies = new ArrayList<String>();
    @JsonProperty("multiClassProficienciesJson")
    private String multiClassProficienciesJson;
    @JsonProperty("features")
    private Object features;
    @JsonProperty("featureRowKeys")
    private Object featureRowKeys;
    @JsonProperty("featureRowKeysJson")
    private String featureRowKeysJson;
    @JsonProperty("contentTypeEnum")
    private Integer contentTypeEnum;
    @JsonProperty("contentType")
    private String contentType;
    @JsonProperty("contentSourceEnum")
    private Integer contentSourceEnum;
    @JsonProperty("contentSource")
    private String contentSource;
    @JsonProperty("partitionKey")
    private String partitionKey;
    @JsonProperty("rowKey")
    private String rowKey;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("eTag")
    private String eTag;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StarWarsPojo withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public StarWarsPojo withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("primaryAbility")
    public String getPrimaryAbility() {
        return primaryAbility;
    }

    @JsonProperty("primaryAbility")
    public void setPrimaryAbility(String primaryAbility) {
        this.primaryAbility = primaryAbility;
    }

    public StarWarsPojo withPrimaryAbility(String primaryAbility) {
        this.primaryAbility = primaryAbility;
        return this;
    }

    @JsonProperty("flavorText")
    public String getFlavorText() {
        return flavorText;
    }

    @JsonProperty("flavorText")
    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public StarWarsPojo withFlavorText(String flavorText) {
        this.flavorText = flavorText;
        return this;
    }

    @JsonProperty("creatingText")
    public String getCreatingText() {
        return creatingText;
    }

    @JsonProperty("creatingText")
    public void setCreatingText(String creatingText) {
        this.creatingText = creatingText;
    }

    public StarWarsPojo withCreatingText(String creatingText) {
        this.creatingText = creatingText;
        return this;
    }

    @JsonProperty("quickBuildText")
    public String getQuickBuildText() {
        return quickBuildText;
    }

    @JsonProperty("quickBuildText")
    public void setQuickBuildText(String quickBuildText) {
        this.quickBuildText = quickBuildText;
    }

    public StarWarsPojo withQuickBuildText(String quickBuildText) {
        this.quickBuildText = quickBuildText;
        return this;
    }

    @JsonProperty("levelChangeHeadersJson")
    public String getLevelChangeHeadersJson() {
        return levelChangeHeadersJson;
    }

    @JsonProperty("levelChangeHeadersJson")
    public void setLevelChangeHeadersJson(String levelChangeHeadersJson) {
        this.levelChangeHeadersJson = levelChangeHeadersJson;
    }

    public StarWarsPojo withLevelChangeHeadersJson(String levelChangeHeadersJson) {
        this.levelChangeHeadersJson = levelChangeHeadersJson;
        return this;
    }

    @JsonProperty("levelChanges")
    public LevelChanges getLevelChanges() {
        return levelChanges;
    }

    @JsonProperty("levelChanges")
    public void setLevelChanges(LevelChanges levelChanges) {
        this.levelChanges = levelChanges;
    }

    public StarWarsPojo withLevelChanges(LevelChanges levelChanges) {
        this.levelChanges = levelChanges;
        return this;
    }

    @JsonProperty("levelChangesJson")
    public String getLevelChangesJson() {
        return levelChangesJson;
    }

    @JsonProperty("levelChangesJson")
    public void setLevelChangesJson(String levelChangesJson) {
        this.levelChangesJson = levelChangesJson;
    }

    public StarWarsPojo withLevelChangesJson(String levelChangesJson) {
        this.levelChangesJson = levelChangesJson;
        return this;
    }

    @JsonProperty("hitDiceDieTypeEnum")
    public Integer getHitDiceDieTypeEnum() {
        return hitDiceDieTypeEnum;
    }

    @JsonProperty("hitDiceDieTypeEnum")
    public void setHitDiceDieTypeEnum(Integer hitDiceDieTypeEnum) {
        this.hitDiceDieTypeEnum = hitDiceDieTypeEnum;
    }

    public StarWarsPojo withHitDiceDieTypeEnum(Integer hitDiceDieTypeEnum) {
        this.hitDiceDieTypeEnum = hitDiceDieTypeEnum;
        return this;
    }

    @JsonProperty("hitDiceDieType")
    public Integer getHitDiceDieType() {
        return hitDiceDieType;
    }

    @JsonProperty("hitDiceDieType")
    public void setHitDiceDieType(Integer hitDiceDieType) {
        this.hitDiceDieType = hitDiceDieType;
    }

    public StarWarsPojo withHitDiceDieType(Integer hitDiceDieType) {
        this.hitDiceDieType = hitDiceDieType;
        return this;
    }

    @JsonProperty("hitPointsAtFirstLevel")
    public String getHitPointsAtFirstLevel() {
        return hitPointsAtFirstLevel;
    }

    @JsonProperty("hitPointsAtFirstLevel")
    public void setHitPointsAtFirstLevel(String hitPointsAtFirstLevel) {
        this.hitPointsAtFirstLevel = hitPointsAtFirstLevel;
    }

    public StarWarsPojo withHitPointsAtFirstLevel(String hitPointsAtFirstLevel) {
        this.hitPointsAtFirstLevel = hitPointsAtFirstLevel;
        return this;
    }

    @JsonProperty("hitPointsAtHigherLevels")
    public String getHitPointsAtHigherLevels() {
        return hitPointsAtHigherLevels;
    }

    @JsonProperty("hitPointsAtHigherLevels")
    public void setHitPointsAtHigherLevels(String hitPointsAtHigherLevels) {
        this.hitPointsAtHigherLevels = hitPointsAtHigherLevels;
    }

    public StarWarsPojo withHitPointsAtHigherLevels(String hitPointsAtHigherLevels) {
        this.hitPointsAtHigherLevels = hitPointsAtHigherLevels;
        return this;
    }

    @JsonProperty("hitPointsAtFirstLevelNumber")
    public Integer getHitPointsAtFirstLevelNumber() {
        return hitPointsAtFirstLevelNumber;
    }

    @JsonProperty("hitPointsAtFirstLevelNumber")
    public void setHitPointsAtFirstLevelNumber(Integer hitPointsAtFirstLevelNumber) {
        this.hitPointsAtFirstLevelNumber = hitPointsAtFirstLevelNumber;
    }

    public StarWarsPojo withHitPointsAtFirstLevelNumber(Integer hitPointsAtFirstLevelNumber) {
        this.hitPointsAtFirstLevelNumber = hitPointsAtFirstLevelNumber;
        return this;
    }

    @JsonProperty("hitPointsAtHigherLevelsNumber")
    public Integer getHitPointsAtHigherLevelsNumber() {
        return hitPointsAtHigherLevelsNumber;
    }

    @JsonProperty("hitPointsAtHigherLevelsNumber")
    public void setHitPointsAtHigherLevelsNumber(Integer hitPointsAtHigherLevelsNumber) {
        this.hitPointsAtHigherLevelsNumber = hitPointsAtHigherLevelsNumber;
    }

    public StarWarsPojo withHitPointsAtHigherLevelsNumber(Integer hitPointsAtHigherLevelsNumber) {
        this.hitPointsAtHigherLevelsNumber = hitPointsAtHigherLevelsNumber;
        return this;
    }

    @JsonProperty("armorProficiencies")
    public List<String> getArmorProficiencies() {
        return armorProficiencies;
    }

    @JsonProperty("armorProficiencies")
    public void setArmorProficiencies(List<String> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public StarWarsPojo withArmorProficiencies(List<String> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
        return this;
    }

    @JsonProperty("armorProficienciesJson")
    public String getArmorProficienciesJson() {
        return armorProficienciesJson;
    }

    @JsonProperty("armorProficienciesJson")
    public void setArmorProficienciesJson(String armorProficienciesJson) {
        this.armorProficienciesJson = armorProficienciesJson;
    }

    public StarWarsPojo withArmorProficienciesJson(String armorProficienciesJson) {
        this.armorProficienciesJson = armorProficienciesJson;
        return this;
    }

    @JsonProperty("weaponProficiencies")
    public List<String> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    @JsonProperty("weaponProficiencies")
    public void setWeaponProficiencies(List<String> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public StarWarsPojo withWeaponProficiencies(List<String> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
        return this;
    }

    @JsonProperty("weaponProficienciesJson")
    public String getWeaponProficienciesJson() {
        return weaponProficienciesJson;
    }

    @JsonProperty("weaponProficienciesJson")
    public void setWeaponProficienciesJson(String weaponProficienciesJson) {
        this.weaponProficienciesJson = weaponProficienciesJson;
    }

    public StarWarsPojo withWeaponProficienciesJson(String weaponProficienciesJson) {
        this.weaponProficienciesJson = weaponProficienciesJson;
        return this;
    }

    @JsonProperty("toolProficiencies")
    public List<String> getToolProficiencies() {
        return toolProficiencies;
    }

    @JsonProperty("toolProficiencies")
    public void setToolProficiencies(List<String> toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
    }

    public StarWarsPojo withToolProficiencies(List<String> toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
        return this;
    }

    @JsonProperty("toolProficienciesJson")
    public String getToolProficienciesJson() {
        return toolProficienciesJson;
    }

    @JsonProperty("toolProficienciesJson")
    public void setToolProficienciesJson(String toolProficienciesJson) {
        this.toolProficienciesJson = toolProficienciesJson;
    }

    public StarWarsPojo withToolProficienciesJson(String toolProficienciesJson) {
        this.toolProficienciesJson = toolProficienciesJson;
        return this;
    }

    @JsonProperty("toolProficienciesList")
    public List<String> getToolProficienciesList() {
        return toolProficienciesList;
    }

    @JsonProperty("toolProficienciesList")
    public void setToolProficienciesList(List<String> toolProficienciesList) {
        this.toolProficienciesList = toolProficienciesList;
    }

    public StarWarsPojo withToolProficienciesList(List<String> toolProficienciesList) {
        this.toolProficienciesList = toolProficienciesList;
        return this;
    }

    @JsonProperty("toolProficienciesListJson")
    public String getToolProficienciesListJson() {
        return toolProficienciesListJson;
    }

    @JsonProperty("toolProficienciesListJson")
    public void setToolProficienciesListJson(String toolProficienciesListJson) {
        this.toolProficienciesListJson = toolProficienciesListJson;
    }

    public StarWarsPojo withToolProficienciesListJson(String toolProficienciesListJson) {
        this.toolProficienciesListJson = toolProficienciesListJson;
        return this;
    }

    @JsonProperty("savingThrows")
    public List<String> getSavingThrows() {
        return savingThrows;
    }

    @JsonProperty("savingThrows")
    public void setSavingThrows(List<String> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public StarWarsPojo withSavingThrows(List<String> savingThrows) {
        this.savingThrows = savingThrows;
        return this;
    }

    @JsonProperty("savingThrowsJson")
    public String getSavingThrowsJson() {
        return savingThrowsJson;
    }

    @JsonProperty("savingThrowsJson")
    public void setSavingThrowsJson(String savingThrowsJson) {
        this.savingThrowsJson = savingThrowsJson;
    }

    public StarWarsPojo withSavingThrowsJson(String savingThrowsJson) {
        this.savingThrowsJson = savingThrowsJson;
        return this;
    }

    @JsonProperty("skillChoices")
    public String getSkillChoices() {
        return skillChoices;
    }

    @JsonProperty("skillChoices")
    public void setSkillChoices(String skillChoices) {
        this.skillChoices = skillChoices;
    }

    public StarWarsPojo withSkillChoices(String skillChoices) {
        this.skillChoices = skillChoices;
        return this;
    }

    @JsonProperty("numSkillChoices")
    public Integer getNumSkillChoices() {
        return numSkillChoices;
    }

    @JsonProperty("numSkillChoices")
    public void setNumSkillChoices(Integer numSkillChoices) {
        this.numSkillChoices = numSkillChoices;
    }

    public StarWarsPojo withNumSkillChoices(Integer numSkillChoices) {
        this.numSkillChoices = numSkillChoices;
        return this;
    }

    @JsonProperty("skillChoicesList")
    public List<String> getSkillChoicesList() {
        return skillChoicesList;
    }

    @JsonProperty("skillChoicesList")
    public void setSkillChoicesList(List<String> skillChoicesList) {
        this.skillChoicesList = skillChoicesList;
    }

    public StarWarsPojo withSkillChoicesList(List<String> skillChoicesList) {
        this.skillChoicesList = skillChoicesList;
        return this;
    }

    @JsonProperty("skillChoicesListJson")
    public String getSkillChoicesListJson() {
        return skillChoicesListJson;
    }

    @JsonProperty("skillChoicesListJson")
    public void setSkillChoicesListJson(String skillChoicesListJson) {
        this.skillChoicesListJson = skillChoicesListJson;
    }

    public StarWarsPojo withSkillChoicesListJson(String skillChoicesListJson) {
        this.skillChoicesListJson = skillChoicesListJson;
        return this;
    }

    @JsonProperty("equipmentLines")
    public List<String> getEquipmentLines() {
        return equipmentLines;
    }

    @JsonProperty("equipmentLines")
    public void setEquipmentLines(List<String> equipmentLines) {
        this.equipmentLines = equipmentLines;
    }

    public StarWarsPojo withEquipmentLines(List<String> equipmentLines) {
        this.equipmentLines = equipmentLines;
        return this;
    }

    @JsonProperty("equipmentLinesJson")
    public String getEquipmentLinesJson() {
        return equipmentLinesJson;
    }

    @JsonProperty("equipmentLinesJson")
    public void setEquipmentLinesJson(String equipmentLinesJson) {
        this.equipmentLinesJson = equipmentLinesJson;
    }

    public StarWarsPojo withEquipmentLinesJson(String equipmentLinesJson) {
        this.equipmentLinesJson = equipmentLinesJson;
        return this;
    }

    @JsonProperty("startingWealthVariant")
    public String getStartingWealthVariant() {
        return startingWealthVariant;
    }

    @JsonProperty("startingWealthVariant")
    public void setStartingWealthVariant(String startingWealthVariant) {
        this.startingWealthVariant = startingWealthVariant;
    }

    public StarWarsPojo withStartingWealthVariant(String startingWealthVariant) {
        this.startingWealthVariant = startingWealthVariant;
        return this;
    }

    @JsonProperty("classFeatureText")
    public String getClassFeatureText() {
        return classFeatureText;
    }

    @JsonProperty("classFeatureText")
    public void setClassFeatureText(String classFeatureText) {
        this.classFeatureText = classFeatureText;
    }

    public StarWarsPojo withClassFeatureText(String classFeatureText) {
        this.classFeatureText = classFeatureText;
        return this;
    }

    @JsonProperty("classFeatureText2")
    public Object getClassFeatureText2() {
        return classFeatureText2;
    }

    @JsonProperty("classFeatureText2")
    public void setClassFeatureText2(Object classFeatureText2) {
        this.classFeatureText2 = classFeatureText2;
    }

    public StarWarsPojo withClassFeatureText2(Object classFeatureText2) {
        this.classFeatureText2 = classFeatureText2;
        return this;
    }

    @JsonProperty("archetypeFlavorText")
    public String getArchetypeFlavorText() {
        return archetypeFlavorText;
    }

    @JsonProperty("archetypeFlavorText")
    public void setArchetypeFlavorText(String archetypeFlavorText) {
        this.archetypeFlavorText = archetypeFlavorText;
    }

    public StarWarsPojo withArchetypeFlavorText(String archetypeFlavorText) {
        this.archetypeFlavorText = archetypeFlavorText;
        return this;
    }

    @JsonProperty("archetypeFlavorName")
    public String getArchetypeFlavorName() {
        return archetypeFlavorName;
    }

    @JsonProperty("archetypeFlavorName")
    public void setArchetypeFlavorName(String archetypeFlavorName) {
        this.archetypeFlavorName = archetypeFlavorName;
    }

    public StarWarsPojo withArchetypeFlavorName(String archetypeFlavorName) {
        this.archetypeFlavorName = archetypeFlavorName;
        return this;
    }

    @JsonProperty("archetypes")
    public Object getArchetypes() {
        return archetypes;
    }

    @JsonProperty("archetypes")
    public void setArchetypes(Object archetypes) {
        this.archetypes = archetypes;
    }

    public StarWarsPojo withArchetypes(Object archetypes) {
        this.archetypes = archetypes;
        return this;
    }

    @JsonProperty("imageUrls")
    public List<String> getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public StarWarsPojo withImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }

    @JsonProperty("imageUrlsJson")
    public String getImageUrlsJson() {
        return imageUrlsJson;
    }

    @JsonProperty("imageUrlsJson")
    public void setImageUrlsJson(String imageUrlsJson) {
        this.imageUrlsJson = imageUrlsJson;
    }

    public StarWarsPojo withImageUrlsJson(String imageUrlsJson) {
        this.imageUrlsJson = imageUrlsJson;
        return this;
    }

    @JsonProperty("casterRatio")
    public Double getCasterRatio() {
        return casterRatio;
    }

    @JsonProperty("casterRatio")
    public void setCasterRatio(Double casterRatio) {
        this.casterRatio = casterRatio;
    }

    public StarWarsPojo withCasterRatio(Double casterRatio) {
        this.casterRatio = casterRatio;
        return this;
    }

    @JsonProperty("casterTypeEnum")
    public Integer getCasterTypeEnum() {
        return casterTypeEnum;
    }

    @JsonProperty("casterTypeEnum")
    public void setCasterTypeEnum(Integer casterTypeEnum) {
        this.casterTypeEnum = casterTypeEnum;
    }

    public StarWarsPojo withCasterTypeEnum(Integer casterTypeEnum) {
        this.casterTypeEnum = casterTypeEnum;
        return this;
    }

    @JsonProperty("casterType")
    public String getCasterType() {
        return casterType;
    }

    @JsonProperty("casterType")
    public void setCasterType(String casterType) {
        this.casterType = casterType;
    }

    public StarWarsPojo withCasterType(String casterType) {
        this.casterType = casterType;
        return this;
    }

    @JsonProperty("multiClassProficiencies")
    public List<String> getMultiClassProficiencies() {
        return multiClassProficiencies;
    }

    @JsonProperty("multiClassProficiencies")
    public void setMultiClassProficiencies(List<String> multiClassProficiencies) {
        this.multiClassProficiencies = multiClassProficiencies;
    }

    public StarWarsPojo withMultiClassProficiencies(List<String> multiClassProficiencies) {
        this.multiClassProficiencies = multiClassProficiencies;
        return this;
    }

    @JsonProperty("multiClassProficienciesJson")
    public String getMultiClassProficienciesJson() {
        return multiClassProficienciesJson;
    }

    @JsonProperty("multiClassProficienciesJson")
    public void setMultiClassProficienciesJson(String multiClassProficienciesJson) {
        this.multiClassProficienciesJson = multiClassProficienciesJson;
    }

    public StarWarsPojo withMultiClassProficienciesJson(String multiClassProficienciesJson) {
        this.multiClassProficienciesJson = multiClassProficienciesJson;
        return this;
    }

    @JsonProperty("features")
    public Object getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(Object features) {
        this.features = features;
    }

    public StarWarsPojo withFeatures(Object features) {
        this.features = features;
        return this;
    }

    @JsonProperty("featureRowKeys")
    public Object getFeatureRowKeys() {
        return featureRowKeys;
    }

    @JsonProperty("featureRowKeys")
    public void setFeatureRowKeys(Object featureRowKeys) {
        this.featureRowKeys = featureRowKeys;
    }

    public StarWarsPojo withFeatureRowKeys(Object featureRowKeys) {
        this.featureRowKeys = featureRowKeys;
        return this;
    }

    @JsonProperty("featureRowKeysJson")
    public String getFeatureRowKeysJson() {
        return featureRowKeysJson;
    }

    @JsonProperty("featureRowKeysJson")
    public void setFeatureRowKeysJson(String featureRowKeysJson) {
        this.featureRowKeysJson = featureRowKeysJson;
    }

    public StarWarsPojo withFeatureRowKeysJson(String featureRowKeysJson) {
        this.featureRowKeysJson = featureRowKeysJson;
        return this;
    }

    @JsonProperty("contentTypeEnum")
    public Integer getContentTypeEnum() {
        return contentTypeEnum;
    }

    @JsonProperty("contentTypeEnum")
    public void setContentTypeEnum(Integer contentTypeEnum) {
        this.contentTypeEnum = contentTypeEnum;
    }

    public StarWarsPojo withContentTypeEnum(Integer contentTypeEnum) {
        this.contentTypeEnum = contentTypeEnum;
        return this;
    }

    @JsonProperty("contentType")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("contentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public StarWarsPojo withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    @JsonProperty("contentSourceEnum")
    public Integer getContentSourceEnum() {
        return contentSourceEnum;
    }

    @JsonProperty("contentSourceEnum")
    public void setContentSourceEnum(Integer contentSourceEnum) {
        this.contentSourceEnum = contentSourceEnum;
    }

    public StarWarsPojo withContentSourceEnum(Integer contentSourceEnum) {
        this.contentSourceEnum = contentSourceEnum;
        return this;
    }

    @JsonProperty("contentSource")
    public String getContentSource() {
        return contentSource;
    }

    @JsonProperty("contentSource")
    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

    public StarWarsPojo withContentSource(String contentSource) {
        this.contentSource = contentSource;
        return this;
    }

    @JsonProperty("partitionKey")
    public String getPartitionKey() {
        return partitionKey;
    }

    @JsonProperty("partitionKey")
    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public StarWarsPojo withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    @JsonProperty("rowKey")
    public String getRowKey() {
        return rowKey;
    }

    @JsonProperty("rowKey")
    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    public StarWarsPojo withRowKey(String rowKey) {
        this.rowKey = rowKey;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public StarWarsPojo withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonProperty("eTag")
    public String geteTag() {
        return eTag;
    }

    @JsonProperty("eTag")
    public void seteTag(String eTag) {
        this.eTag = eTag;
    }

    public StarWarsPojo witheTag(String eTag) {
        this.eTag = eTag;
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

    public StarWarsPojo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StarWarsPojo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("primaryAbility");
        sb.append('=');
        sb.append(((this.primaryAbility == null)?"<null>":this.primaryAbility));
        sb.append(',');
        sb.append("flavorText");
        sb.append('=');
        sb.append(((this.flavorText == null)?"<null>":this.flavorText));
        sb.append(',');
        sb.append("creatingText");
        sb.append('=');
        sb.append(((this.creatingText == null)?"<null>":this.creatingText));
        sb.append(',');
        sb.append("quickBuildText");
        sb.append('=');
        sb.append(((this.quickBuildText == null)?"<null>":this.quickBuildText));
        sb.append(',');
        sb.append("levelChangeHeadersJson");
        sb.append('=');
        sb.append(((this.levelChangeHeadersJson == null)?"<null>":this.levelChangeHeadersJson));
        sb.append(',');
        sb.append("levelChanges");
        sb.append('=');
        sb.append(((this.levelChanges == null)?"<null>":this.levelChanges));
        sb.append(',');
        sb.append("levelChangesJson");
        sb.append('=');
        sb.append(((this.levelChangesJson == null)?"<null>":this.levelChangesJson));
        sb.append(',');
        sb.append("hitDiceDieTypeEnum");
        sb.append('=');
        sb.append(((this.hitDiceDieTypeEnum == null)?"<null>":this.hitDiceDieTypeEnum));
        sb.append(',');
        sb.append("hitDiceDieType");
        sb.append('=');
        sb.append(((this.hitDiceDieType == null)?"<null>":this.hitDiceDieType));
        sb.append(',');
        sb.append("hitPointsAtFirstLevel");
        sb.append('=');
        sb.append(((this.hitPointsAtFirstLevel == null)?"<null>":this.hitPointsAtFirstLevel));
        sb.append(',');
        sb.append("hitPointsAtHigherLevels");
        sb.append('=');
        sb.append(((this.hitPointsAtHigherLevels == null)?"<null>":this.hitPointsAtHigherLevels));
        sb.append(',');
        sb.append("hitPointsAtFirstLevelNumber");
        sb.append('=');
        sb.append(((this.hitPointsAtFirstLevelNumber == null)?"<null>":this.hitPointsAtFirstLevelNumber));
        sb.append(',');
        sb.append("hitPointsAtHigherLevelsNumber");
        sb.append('=');
        sb.append(((this.hitPointsAtHigherLevelsNumber == null)?"<null>":this.hitPointsAtHigherLevelsNumber));
        sb.append(',');
        sb.append("armorProficiencies");
        sb.append('=');
        sb.append(((this.armorProficiencies == null)?"<null>":this.armorProficiencies));
        sb.append(',');
        sb.append("armorProficienciesJson");
        sb.append('=');
        sb.append(((this.armorProficienciesJson == null)?"<null>":this.armorProficienciesJson));
        sb.append(',');
        sb.append("weaponProficiencies");
        sb.append('=');
        sb.append(((this.weaponProficiencies == null)?"<null>":this.weaponProficiencies));
        sb.append(',');
        sb.append("weaponProficienciesJson");
        sb.append('=');
        sb.append(((this.weaponProficienciesJson == null)?"<null>":this.weaponProficienciesJson));
        sb.append(',');
        sb.append("toolProficiencies");
        sb.append('=');
        sb.append(((this.toolProficiencies == null)?"<null>":this.toolProficiencies));
        sb.append(',');
        sb.append("toolProficienciesJson");
        sb.append('=');
        sb.append(((this.toolProficienciesJson == null)?"<null>":this.toolProficienciesJson));
        sb.append(',');
        sb.append("toolProficienciesList");
        sb.append('=');
        sb.append(((this.toolProficienciesList == null)?"<null>":this.toolProficienciesList));
        sb.append(',');
        sb.append("toolProficienciesListJson");
        sb.append('=');
        sb.append(((this.toolProficienciesListJson == null)?"<null>":this.toolProficienciesListJson));
        sb.append(',');
        sb.append("savingThrows");
        sb.append('=');
        sb.append(((this.savingThrows == null)?"<null>":this.savingThrows));
        sb.append(',');
        sb.append("savingThrowsJson");
        sb.append('=');
        sb.append(((this.savingThrowsJson == null)?"<null>":this.savingThrowsJson));
        sb.append(',');
        sb.append("skillChoices");
        sb.append('=');
        sb.append(((this.skillChoices == null)?"<null>":this.skillChoices));
        sb.append(',');
        sb.append("numSkillChoices");
        sb.append('=');
        sb.append(((this.numSkillChoices == null)?"<null>":this.numSkillChoices));
        sb.append(',');
        sb.append("skillChoicesList");
        sb.append('=');
        sb.append(((this.skillChoicesList == null)?"<null>":this.skillChoicesList));
        sb.append(',');
        sb.append("skillChoicesListJson");
        sb.append('=');
        sb.append(((this.skillChoicesListJson == null)?"<null>":this.skillChoicesListJson));
        sb.append(',');
        sb.append("equipmentLines");
        sb.append('=');
        sb.append(((this.equipmentLines == null)?"<null>":this.equipmentLines));
        sb.append(',');
        sb.append("equipmentLinesJson");
        sb.append('=');
        sb.append(((this.equipmentLinesJson == null)?"<null>":this.equipmentLinesJson));
        sb.append(',');
        sb.append("startingWealthVariant");
        sb.append('=');
        sb.append(((this.startingWealthVariant == null)?"<null>":this.startingWealthVariant));
        sb.append(',');
        sb.append("classFeatureText");
        sb.append('=');
        sb.append(((this.classFeatureText == null)?"<null>":this.classFeatureText));
        sb.append(',');
        sb.append("classFeatureText2");
        sb.append('=');
        sb.append(((this.classFeatureText2 == null)?"<null>":this.classFeatureText2));
        sb.append(',');
        sb.append("archetypeFlavorText");
        sb.append('=');
        sb.append(((this.archetypeFlavorText == null)?"<null>":this.archetypeFlavorText));
        sb.append(',');
        sb.append("archetypeFlavorName");
        sb.append('=');
        sb.append(((this.archetypeFlavorName == null)?"<null>":this.archetypeFlavorName));
        sb.append(',');
        sb.append("archetypes");
        sb.append('=');
        sb.append(((this.archetypes == null)?"<null>":this.archetypes));
        sb.append(',');
        sb.append("imageUrls");
        sb.append('=');
        sb.append(((this.imageUrls == null)?"<null>":this.imageUrls));
        sb.append(',');
        sb.append("imageUrlsJson");
        sb.append('=');
        sb.append(((this.imageUrlsJson == null)?"<null>":this.imageUrlsJson));
        sb.append(',');
        sb.append("casterRatio");
        sb.append('=');
        sb.append(((this.casterRatio == null)?"<null>":this.casterRatio));
        sb.append(',');
        sb.append("casterTypeEnum");
        sb.append('=');
        sb.append(((this.casterTypeEnum == null)?"<null>":this.casterTypeEnum));
        sb.append(',');
        sb.append("casterType");
        sb.append('=');
        sb.append(((this.casterType == null)?"<null>":this.casterType));
        sb.append(',');
        sb.append("multiClassProficiencies");
        sb.append('=');
        sb.append(((this.multiClassProficiencies == null)?"<null>":this.multiClassProficiencies));
        sb.append(',');
        sb.append("multiClassProficienciesJson");
        sb.append('=');
        sb.append(((this.multiClassProficienciesJson == null)?"<null>":this.multiClassProficienciesJson));
        sb.append(',');
        sb.append("features");
        sb.append('=');
        sb.append(((this.features == null)?"<null>":this.features));
        sb.append(',');
        sb.append("featureRowKeys");
        sb.append('=');
        sb.append(((this.featureRowKeys == null)?"<null>":this.featureRowKeys));
        sb.append(',');
        sb.append("featureRowKeysJson");
        sb.append('=');
        sb.append(((this.featureRowKeysJson == null)?"<null>":this.featureRowKeysJson));
        sb.append(',');
        sb.append("contentTypeEnum");
        sb.append('=');
        sb.append(((this.contentTypeEnum == null)?"<null>":this.contentTypeEnum));
        sb.append(',');
        sb.append("contentType");
        sb.append('=');
        sb.append(((this.contentType == null)?"<null>":this.contentType));
        sb.append(',');
        sb.append("contentSourceEnum");
        sb.append('=');
        sb.append(((this.contentSourceEnum == null)?"<null>":this.contentSourceEnum));
        sb.append(',');
        sb.append("contentSource");
        sb.append('=');
        sb.append(((this.contentSource == null)?"<null>":this.contentSource));
        sb.append(',');
        sb.append("partitionKey");
        sb.append('=');
        sb.append(((this.partitionKey == null)?"<null>":this.partitionKey));
        sb.append(',');
        sb.append("rowKey");
        sb.append('=');
        sb.append(((this.rowKey == null)?"<null>":this.rowKey));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("eTag");
        sb.append('=');
        sb.append(((this.eTag == null)?"<null>":this.eTag));
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
        result = ((result* 31)+((this.flavorText == null)? 0 :this.flavorText.hashCode()));
        result = ((result* 31)+((this.levelChangeHeadersJson == null)? 0 :this.levelChangeHeadersJson.hashCode()));
        result = ((result* 31)+((this.equipmentLinesJson == null)? 0 :this.equipmentLinesJson.hashCode()));
        result = ((result* 31)+((this.skillChoices == null)? 0 :this.skillChoices.hashCode()));
        result = ((result* 31)+((this.toolProficiencies == null)? 0 :this.toolProficiencies.hashCode()));
        result = ((result* 31)+((this.casterType == null)? 0 :this.casterType.hashCode()));
        result = ((result* 31)+((this.features == null)? 0 :this.features.hashCode()));
        result = ((result* 31)+((this.weaponProficiencies == null)? 0 :this.weaponProficiencies.hashCode()));
        result = ((result* 31)+((this.archetypeFlavorName == null)? 0 :this.archetypeFlavorName.hashCode()));
        result = ((result* 31)+((this.contentType == null)? 0 :this.contentType.hashCode()));
        result = ((result* 31)+((this.toolProficienciesListJson == null)? 0 :this.toolProficienciesListJson.hashCode()));
        result = ((result* 31)+((this.hitPointsAtHigherLevelsNumber == null)? 0 :this.hitPointsAtHigherLevelsNumber.hashCode()));
        result = ((result* 31)+((this.featureRowKeys == null)? 0 :this.featureRowKeys.hashCode()));
        result = ((result* 31)+((this.casterRatio == null)? 0 :this.casterRatio.hashCode()));
        result = ((result* 31)+((this.numSkillChoices == null)? 0 :this.numSkillChoices.hashCode()));
        result = ((result* 31)+((this.hitDiceDieTypeEnum == null)? 0 :this.hitDiceDieTypeEnum.hashCode()));
        result = ((result* 31)+((this.hitDiceDieType == null)? 0 :this.hitDiceDieType.hashCode()));
        result = ((result* 31)+((this.contentSource == null)? 0 :this.contentSource.hashCode()));
        result = ((result* 31)+((this.classFeatureText == null)? 0 :this.classFeatureText.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.hitPointsAtHigherLevels == null)? 0 :this.hitPointsAtHigherLevels.hashCode()));
        result = ((result* 31)+((this.multiClassProficiencies == null)? 0 :this.multiClassProficiencies.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.weaponProficienciesJson == null)? 0 :this.weaponProficienciesJson.hashCode()));
        result = ((result* 31)+((this.equipmentLines == null)? 0 :this.equipmentLines.hashCode()));
        result = ((result* 31)+((this.toolProficienciesList == null)? 0 :this.toolProficienciesList.hashCode()));
        result = ((result* 31)+((this.imageUrlsJson == null)? 0 :this.imageUrlsJson.hashCode()));
        result = ((result* 31)+((this.armorProficiencies == null)? 0 :this.armorProficiencies.hashCode()));
        result = ((result* 31)+((this.toolProficienciesJson == null)? 0 :this.toolProficienciesJson.hashCode()));
        result = ((result* 31)+((this.primaryAbility == null)? 0 :this.primaryAbility.hashCode()));
        result = ((result* 31)+((this.startingWealthVariant == null)? 0 :this.startingWealthVariant.hashCode()));
        result = ((result* 31)+((this.archetypes == null)? 0 :this.archetypes.hashCode()));
        result = ((result* 31)+((this.partitionKey == null)? 0 :this.partitionKey.hashCode()));
        result = ((result* 31)+((this.levelChanges == null)? 0 :this.levelChanges.hashCode()));
        result = ((result* 31)+((this.eTag == null)? 0 :this.eTag.hashCode()));
        result = ((result* 31)+((this.armorProficienciesJson == null)? 0 :this.armorProficienciesJson.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.summary == null)? 0 :this.summary.hashCode()));
        result = ((result* 31)+((this.skillChoicesList == null)? 0 :this.skillChoicesList.hashCode()));
        result = ((result* 31)+((this.hitPointsAtFirstLevelNumber == null)? 0 :this.hitPointsAtFirstLevelNumber.hashCode()));
        result = ((result* 31)+((this.casterTypeEnum == null)? 0 :this.casterTypeEnum.hashCode()));
        result = ((result* 31)+((this.featureRowKeysJson == null)? 0 :this.featureRowKeysJson.hashCode()));
        result = ((result* 31)+((this.levelChangesJson == null)? 0 :this.levelChangesJson.hashCode()));
        result = ((result* 31)+((this.savingThrowsJson == null)? 0 :this.savingThrowsJson.hashCode()));
        result = ((result* 31)+((this.contentTypeEnum == null)? 0 :this.contentTypeEnum.hashCode()));
        result = ((result* 31)+((this.hitPointsAtFirstLevel == null)? 0 :this.hitPointsAtFirstLevel.hashCode()));
        result = ((result* 31)+((this.savingThrows == null)? 0 :this.savingThrows.hashCode()));
        result = ((result* 31)+((this.classFeatureText2 == null)? 0 :this.classFeatureText2 .hashCode()));
        result = ((result* 31)+((this.archetypeFlavorText == null)? 0 :this.archetypeFlavorText.hashCode()));
        result = ((result* 31)+((this.multiClassProficienciesJson == null)? 0 :this.multiClassProficienciesJson.hashCode()));
        result = ((result* 31)+((this.quickBuildText == null)? 0 :this.quickBuildText.hashCode()));
        result = ((result* 31)+((this.creatingText == null)? 0 :this.creatingText.hashCode()));
        result = ((result* 31)+((this.imageUrls == null)? 0 :this.imageUrls.hashCode()));
        result = ((result* 31)+((this.skillChoicesListJson == null)? 0 :this.skillChoicesListJson.hashCode()));
        result = ((result* 31)+((this.rowKey == null)? 0 :this.rowKey.hashCode()));
        result = ((result* 31)+((this.contentSourceEnum == null)? 0 :this.contentSourceEnum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StarWarsPojo) == false) {
            return false;
        }
        StarWarsPojo rhs = ((StarWarsPojo) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.flavorText == rhs.flavorText)||((this.flavorText!= null)&&this.flavorText.equals(rhs.flavorText)))&&((this.levelChangeHeadersJson == rhs.levelChangeHeadersJson)||((this.levelChangeHeadersJson!= null)&&this.levelChangeHeadersJson.equals(rhs.levelChangeHeadersJson))))&&((this.equipmentLinesJson == rhs.equipmentLinesJson)||((this.equipmentLinesJson!= null)&&this.equipmentLinesJson.equals(rhs.equipmentLinesJson))))&&((this.skillChoices == rhs.skillChoices)||((this.skillChoices!= null)&&this.skillChoices.equals(rhs.skillChoices))))&&((this.toolProficiencies == rhs.toolProficiencies)||((this.toolProficiencies!= null)&&this.toolProficiencies.equals(rhs.toolProficiencies))))&&((this.casterType == rhs.casterType)||((this.casterType!= null)&&this.casterType.equals(rhs.casterType))))&&((this.features == rhs.features)||((this.features!= null)&&this.features.equals(rhs.features))))&&((this.weaponProficiencies == rhs.weaponProficiencies)||((this.weaponProficiencies!= null)&&this.weaponProficiencies.equals(rhs.weaponProficiencies))))&&((this.archetypeFlavorName == rhs.archetypeFlavorName)||((this.archetypeFlavorName!= null)&&this.archetypeFlavorName.equals(rhs.archetypeFlavorName))))&&((this.contentType == rhs.contentType)||((this.contentType!= null)&&this.contentType.equals(rhs.contentType))))&&((this.toolProficienciesListJson == rhs.toolProficienciesListJson)||((this.toolProficienciesListJson!= null)&&this.toolProficienciesListJson.equals(rhs.toolProficienciesListJson))))&&((this.hitPointsAtHigherLevelsNumber == rhs.hitPointsAtHigherLevelsNumber)||((this.hitPointsAtHigherLevelsNumber!= null)&&this.hitPointsAtHigherLevelsNumber.equals(rhs.hitPointsAtHigherLevelsNumber))))&&((this.featureRowKeys == rhs.featureRowKeys)||((this.featureRowKeys!= null)&&this.featureRowKeys.equals(rhs.featureRowKeys))))&&((this.casterRatio == rhs.casterRatio)||((this.casterRatio!= null)&&this.casterRatio.equals(rhs.casterRatio))))&&((this.numSkillChoices == rhs.numSkillChoices)||((this.numSkillChoices!= null)&&this.numSkillChoices.equals(rhs.numSkillChoices))))&&((this.hitDiceDieTypeEnum == rhs.hitDiceDieTypeEnum)||((this.hitDiceDieTypeEnum!= null)&&this.hitDiceDieTypeEnum.equals(rhs.hitDiceDieTypeEnum))))&&((this.hitDiceDieType == rhs.hitDiceDieType)||((this.hitDiceDieType!= null)&&this.hitDiceDieType.equals(rhs.hitDiceDieType))))&&((this.contentSource == rhs.contentSource)||((this.contentSource!= null)&&this.contentSource.equals(rhs.contentSource))))&&((this.classFeatureText == rhs.classFeatureText)||((this.classFeatureText!= null)&&this.classFeatureText.equals(rhs.classFeatureText))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.hitPointsAtHigherLevels == rhs.hitPointsAtHigherLevels)||((this.hitPointsAtHigherLevels!= null)&&this.hitPointsAtHigherLevels.equals(rhs.hitPointsAtHigherLevels))))&&((this.multiClassProficiencies == rhs.multiClassProficiencies)||((this.multiClassProficiencies!= null)&&this.multiClassProficiencies.equals(rhs.multiClassProficiencies))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.weaponProficienciesJson == rhs.weaponProficienciesJson)||((this.weaponProficienciesJson!= null)&&this.weaponProficienciesJson.equals(rhs.weaponProficienciesJson))))&&((this.equipmentLines == rhs.equipmentLines)||((this.equipmentLines!= null)&&this.equipmentLines.equals(rhs.equipmentLines))))&&((this.toolProficienciesList == rhs.toolProficienciesList)||((this.toolProficienciesList!= null)&&this.toolProficienciesList.equals(rhs.toolProficienciesList))))&&((this.imageUrlsJson == rhs.imageUrlsJson)||((this.imageUrlsJson!= null)&&this.imageUrlsJson.equals(rhs.imageUrlsJson))))&&((this.armorProficiencies == rhs.armorProficiencies)||((this.armorProficiencies!= null)&&this.armorProficiencies.equals(rhs.armorProficiencies))))&&((this.toolProficienciesJson == rhs.toolProficienciesJson)||((this.toolProficienciesJson!= null)&&this.toolProficienciesJson.equals(rhs.toolProficienciesJson))))&&((this.primaryAbility == rhs.primaryAbility)||((this.primaryAbility!= null)&&this.primaryAbility.equals(rhs.primaryAbility))))&&((this.startingWealthVariant == rhs.startingWealthVariant)||((this.startingWealthVariant!= null)&&this.startingWealthVariant.equals(rhs.startingWealthVariant))))&&((this.archetypes == rhs.archetypes)||((this.archetypes!= null)&&this.archetypes.equals(rhs.archetypes))))&&((this.partitionKey == rhs.partitionKey)||((this.partitionKey!= null)&&this.partitionKey.equals(rhs.partitionKey))))&&((this.levelChanges == rhs.levelChanges)||((this.levelChanges!= null)&&this.levelChanges.equals(rhs.levelChanges))))&&((this.eTag == rhs.eTag)||((this.eTag!= null)&&this.eTag.equals(rhs.eTag))))&&((this.armorProficienciesJson == rhs.armorProficienciesJson)||((this.armorProficienciesJson!= null)&&this.armorProficienciesJson.equals(rhs.armorProficienciesJson))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.summary == rhs.summary)||((this.summary!= null)&&this.summary.equals(rhs.summary))))&&((this.skillChoicesList == rhs.skillChoicesList)||((this.skillChoicesList!= null)&&this.skillChoicesList.equals(rhs.skillChoicesList))))&&((this.hitPointsAtFirstLevelNumber == rhs.hitPointsAtFirstLevelNumber)||((this.hitPointsAtFirstLevelNumber!= null)&&this.hitPointsAtFirstLevelNumber.equals(rhs.hitPointsAtFirstLevelNumber))))&&((this.casterTypeEnum == rhs.casterTypeEnum)||((this.casterTypeEnum!= null)&&this.casterTypeEnum.equals(rhs.casterTypeEnum))))&&((this.featureRowKeysJson == rhs.featureRowKeysJson)||((this.featureRowKeysJson!= null)&&this.featureRowKeysJson.equals(rhs.featureRowKeysJson))))&&((this.levelChangesJson == rhs.levelChangesJson)||((this.levelChangesJson!= null)&&this.levelChangesJson.equals(rhs.levelChangesJson))))&&((this.savingThrowsJson == rhs.savingThrowsJson)||((this.savingThrowsJson!= null)&&this.savingThrowsJson.equals(rhs.savingThrowsJson))))&&((this.contentTypeEnum == rhs.contentTypeEnum)||((this.contentTypeEnum!= null)&&this.contentTypeEnum.equals(rhs.contentTypeEnum))))&&((this.hitPointsAtFirstLevel == rhs.hitPointsAtFirstLevel)||((this.hitPointsAtFirstLevel!= null)&&this.hitPointsAtFirstLevel.equals(rhs.hitPointsAtFirstLevel))))&&((this.savingThrows == rhs.savingThrows)||((this.savingThrows!= null)&&this.savingThrows.equals(rhs.savingThrows))))&&((this.classFeatureText2 == rhs.classFeatureText2)||((this.classFeatureText2 != null)&&this.classFeatureText2 .equals(rhs.classFeatureText2))))&&((this.archetypeFlavorText == rhs.archetypeFlavorText)||((this.archetypeFlavorText!= null)&&this.archetypeFlavorText.equals(rhs.archetypeFlavorText))))&&((this.multiClassProficienciesJson == rhs.multiClassProficienciesJson)||((this.multiClassProficienciesJson!= null)&&this.multiClassProficienciesJson.equals(rhs.multiClassProficienciesJson))))&&((this.quickBuildText == rhs.quickBuildText)||((this.quickBuildText!= null)&&this.quickBuildText.equals(rhs.quickBuildText))))&&((this.creatingText == rhs.creatingText)||((this.creatingText!= null)&&this.creatingText.equals(rhs.creatingText))))&&((this.imageUrls == rhs.imageUrls)||((this.imageUrls!= null)&&this.imageUrls.equals(rhs.imageUrls))))&&((this.skillChoicesListJson == rhs.skillChoicesListJson)||((this.skillChoicesListJson!= null)&&this.skillChoicesListJson.equals(rhs.skillChoicesListJson))))&&((this.rowKey == rhs.rowKey)||((this.rowKey!= null)&&this.rowKey.equals(rhs.rowKey))))&&((this.contentSourceEnum == rhs.contentSourceEnum)||((this.contentSourceEnum!= null)&&this.contentSourceEnum.equals(rhs.contentSourceEnum))));
    }

}
