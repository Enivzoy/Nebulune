package foo.starred.nebulune.mixin.accessors;

import foo.starred.athen.modules.impl.general.LoadoutKeybinds;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(value = LoadoutKeybinds.class, remap = false)
public interface LoadoutKeybindsAccessor {
    @Accessor("slots")
    List<?> nebulune$getSlots();
}