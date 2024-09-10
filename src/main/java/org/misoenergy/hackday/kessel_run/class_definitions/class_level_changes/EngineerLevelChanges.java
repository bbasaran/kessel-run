package org.misoenergy.hackday.kessel_run.class_definitions.class_level_changes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.misoenergy.hackday.kessel_run.class_definitions.LevelChanges;

@Getter
@Setter
@NoArgsConstructor
public class EngineerLevelChanges extends LevelChanges {
    private String techPowersKnown;
    private String techPoints;
    private String maxPowerLevel;
    private String potentAptitude;
    private String modificationSlots;
}
