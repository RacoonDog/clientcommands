package net.earthcomputer.clientcommands.mixin.rngevents.droppableinventory;

import net.earthcomputer.clientcommands.interfaces.IDroppableInventoryContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractCraftingMenu;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.CraftingMenu;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractCraftingMenu.class)
public class AbstractCraftingMenuMixin implements IDroppableInventoryContainer {

    @Shadow @Final
    protected CraftingContainer craftSlots;

    @Override
    public Container getDroppableInventory() {
        return craftSlots;
    }
}
