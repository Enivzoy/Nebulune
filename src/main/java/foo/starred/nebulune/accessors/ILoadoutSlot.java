package foo.starred.nebulune.accessors;

import com.mojang.blaze3d.platform.InputConstants;

public interface ILoadoutSlot {
    int getIndex();
    int getIdx();
    InputConstants.Key getValue();
    boolean getEquipped();
}