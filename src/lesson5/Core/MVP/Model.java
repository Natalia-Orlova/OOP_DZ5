package lesson5.Core.MVP;

import lesson5.Core.Infrastructure.Attendance;

public class Model {
    Attendance attendance;
    private String path;

    public Model (String path) {
        attendance = new Attendance();
    }
}
