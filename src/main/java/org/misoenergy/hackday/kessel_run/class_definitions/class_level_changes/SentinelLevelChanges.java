package org.misoenergy.hackday.kessel_run.class_definitions.class_level_changes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.misoenergy.hackday.kessel_run.class_definitions.LevelChanges;

@Getter
@Setter
@NoArgsConstructor
public class SentinelLevelChanges extends LevelChanges {
    private String forcePowersKnown;
    private String forcePoints;
    private String maxPowerLevel;
    private String kineticCombat;
    private String idealsKnown;
    private String manifests;
}
