package org.misoenergy.hackday.kessel_run.class_definitions.class_level_changes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.misoenergy.hackday.kessel_run.class_definitions.LevelChanges;

@Getter
@Setter
@NoArgsConstructor
public class GuardianLevelChanges extends LevelChanges {
    private String forcePowersKnown;
    private String forcePoints;
    private String maxPowerLevel;
    private String focusedStrikes;
    private String aurasKnown;
    private String auraRadius;
}
