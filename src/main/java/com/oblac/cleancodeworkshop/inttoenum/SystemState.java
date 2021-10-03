package com.oblac.cleancodeworkshop.inttoenum;

/**
 * This class holds only ints to track the system state.
 * <p>
 * Exercise: refactor ints to Enum in small steps with as much of automatic refactorings as possible.
 * The tests must ALWAYS stay green.
 */
public class SystemState {

    public static final int ALL_SERVICES_OK = 0;
    public static final int COMMUNICATION_OK = 1;
    public static final int COMMUNICATION_DISTURBED = 2;
    public static final int MAIl_SERVICE_FAILURE = 3;
    public static final int REPORT_SERVICE_FAILURE = 4;
    public static final int DATABASE_CONNECTION_FAILURE = 5;
    public static final int INTERNAL_PROCESING_FAILURE = 6;

    private final int state;

    SystemState(final int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    // Alternative Look-Up-Map
    // public static final Map<Integer, String> errorCodeToDescriptionMap = new
    // HashMap<Integer, String>();
    // static {
    // errorCodeToDescriptionMap.put(ALL_SERVICES_OK, "All Services OK");
    // // ...
    // }

    public static String getDescriptionForState(final int state) {
        if (state == ALL_SERVICES_OK)
            return "All Services OK";

        if (state == COMMUNICATION_OK)
            return "Communication OK";

        if (state == COMMUNICATION_DISTURBED)
            return "Communication Disturbed";

        if (state == MAIl_SERVICE_FAILURE)
            return "MailService Failure";

        if (state == REPORT_SERVICE_FAILURE)
            return "ReportService Failure";

        if (state == DATABASE_CONNECTION_FAILURE)
            return "Database Connection Failure";

        if (state == INTERNAL_PROCESING_FAILURE)
            return "Internal Processing Failure";

        return "Unknown state";
    }
}
