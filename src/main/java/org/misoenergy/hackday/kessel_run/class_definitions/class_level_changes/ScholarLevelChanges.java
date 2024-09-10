package org.misoenergy.hackday.kessel_run.class_definitions.class_level_changes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.misoenergy.hackday.kessel_run.class_definitions.LevelChanges;

@Getter
@Setter
@NoArgsConstructor
public class ScholarLevelChanges extends LevelChanges {
    private String maneuversKnown;
    private String superiorityDiceQuantity;
    private String superiorityDiceSize;
    private String discoveries;
}
