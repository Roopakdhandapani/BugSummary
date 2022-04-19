package Summary;

public class Constants {

    public static String Priority,Status;
    public static void setConstants(int i) {
        if (i == 1) {
            Priority = "High";
            Status = "Open";
        } else if (i == 2) {
            Priority = "High";
            Status = "Resolved";
        } else if (i == 3) {
            Priority = "High";
        } else if (i == 4) {
            Priority = "Medium";
            Status = "Open";
        } else if (i == 5) {
            Priority = "Medium";
            Status = "Resolved";
        } else if (i == 6) {
            Priority = "Medium";
        } else if (i == 7) {
            Priority = "Low";
            Status = "Open";
        } else if (i == 8) {
            Priority = "Low";
            Status = "Resolved";
        } else if (i == 9) {
            Priority = "Low";
        } else if (i == 10) {
            Priority = "High+OR+Medium+OR+Low";
            Status = "Open";
        } else if (i == 11) {
            Priority = "High+OR+Medium+OR+Low";
            Status = "Resolved";
        } else if (i == 12) {
            Priority = "High+OR+Medium+OR+Low";
        }
    }
}
