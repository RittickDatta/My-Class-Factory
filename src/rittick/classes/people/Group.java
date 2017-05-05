package rittick.classes.people;

/**
 * Created by Rittick on 5/5/2017.
 */
public class Group {

    private String groupName;
    private String groupDescription;
    private String groupActivities;

    public Group(String groupName, String groupDescription, String groupActivities) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.groupActivities = groupActivities;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getGroupActivities() {
        return groupActivities;
    }

    public void setGroupActivities(String groupActivities) {
        this.groupActivities = groupActivities;
    }
}
