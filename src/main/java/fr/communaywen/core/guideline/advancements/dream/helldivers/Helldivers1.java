package fr.communaywen.core.guideline.advancements.dream.helldivers;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;

public class Helldivers1 extends BaseAdvancement {
    public Helldivers1(@NotNull Advancement parent) {
        super(
                "helldivers/one",
                new AdvancementDisplay(
                        Material.WOODEN_SWORD,
                        "Helldivers I",
                        AdvancementFrameType.TASK,
                        true,
                        false,
                        1F,10F,
                        "Pour la démocratie"
                ),
                parent
        );
    }
}
