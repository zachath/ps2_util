//Zacharias Thorell

package lib.event;

import org.json.JSONObject;

public class GainExperienceCharacterEvent extends CharacterEvent {
    private static final String EVENT_NAME = "GainExperience";

    public final String amount;

    protected GainExperienceCharacterEvent(String world_id, String timestamp, String player, String amount) {
        super(EVENT_NAME, world_id, timestamp, player);
        this.amount = amount;
    }

    protected GainExperienceCharacterEvent(JSONObject object) {
        super(object);
        this.amount = object.getString("amount");
    }

    @Override
    public String toString() {
        return characterID + " has gained " + amount + " experience";
    }
}