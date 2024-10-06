package fr.communaywen.core.guideline.advancements.dream.fishing;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import dev.lone.itemsadder.api.CustomStack;
import dev.lone.itemsadder.api.FontImages.FontImageWrapper;
import org.jetbrains.annotations.NotNull;

public class DockerAdvDream extends BaseAdvancement {
    public DockerAdvDream(@NotNull Advancement parent) {
        super(
                "dockerfish",
                new AdvancementDisplay(
                        CustomStack.getInstance("aywen:dockerfish").getItemStack(),
                        "Poisson Docker",
                        AdvancementFrameType.TASK,
                        true,
                        false,
                        2F,12.5F,
                        "Vous sentez l'odeur de la blague ? "+ FontImageWrapper.replaceFontImages(":nerd:")
                ),
                parent
        );
    }
}
