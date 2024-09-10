package org.misoenergy.hackday.kessel_run.class_definitions.class_level_changes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.misoenergy.hackday.kessel_run.class_definitions.LevelChanges;

@Getter
@Setter
@NoArgsConstructor
public class MonkLevelChanges extends LevelChanges {
    private String martialArts;
    private String focusPoints;
    private String monasticVows;
    private String unarmoredMovement;
}
