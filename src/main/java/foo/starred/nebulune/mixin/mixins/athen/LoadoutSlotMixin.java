package foo.starred.nebulune.mixin.mixins.athen;

import foo.starred.nebulune.accessors.ILoadoutSlot;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = "foo.starred.athen.modules.impl.general.LoadoutKeybinds$LoadoutSlot", remap = false)
public interface LoadoutSlotMixin extends ILoadoutSlot {
}