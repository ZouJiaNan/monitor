package com.casit;

/**
 * @author ZouJiaNan
 * @version 1.0.0
 * @Description TODO
 * @createTime 2021年02月03日 14:55:00
 */
public class Monitor {
    private int id;
    private String MINDRAY_N_SERIES;
    private String INSERT_TIME;
    private String MDC_ECG_ELEC_POTL_V5;
    private String MDC_ECG_ELEC_POTL_II;
    private String MDC_ECG_ELEC_POTL_V6;
    private String MDC_ECG_ELEC_POTL_V3;
    private String MDC_CONC_AWAY_CO2;
    private String MDC_ECG_ELEC_POTL_V4;
    private String MDC_CO2_RESP_RATE;
    private String MDC_CONC_AWAY_CO2_INSP;
    private String MDC_ECG_ELEC_POTL_V1;
    private String MDC_ECG_ELEC_POTL_V2;
    private String MDC_ATTR_SAMP_RATE;
    private String MDC_TTHOR_RESP_RATE;
    private String MDC_IMPED_TTHOR;
    private String MDC_ECG_HEART_RATE;
    private String MNDRY_ECG_P_V_C_RonT_RATE;
    private String MDC_CONC_AWAY_SEVOFL_ET;
    private String MDC_CONC_AWAY_O2;
    private String MDC_ECG_ELEC_POTL_III;
    private String MDC_CONC_AWAY_CO2_ET;
    private String MNDRY_CONC_MAC;
    private String MDC_ECG_ELEC_POTL_AVF;
    private String MDC_CONC_AWAY_N2O_ET;
    private String MDC_EVT_INOP;
    private String MDC_PULS_OXIM_SAT_O2;
    private String MNDRY_ECG_VPB_RATE;
    private String MDC_CONC_AWAY_O2_INSP;
    private String MDC_PULS_OXIM_PLETH;
    private String MNDRY_ECG_PAUSE_RATE;
    private String MDC_ECG_ELEC_POTL_AVL;
    private String MDC_ECG_ELEC_POTL_AVR;
    private String MDC_CONC_AWAY_N2O;
    private String MNDRY_ECG_MISSED_BEATS_RATE;
    private String MDC_ATTR_NU_MSMT_RES;
    private String MDC_CONC_AWAY_N2O_INSP;
    private String MDC_PULS_OXIM_PULS_RATE;
    private String MDC_CONC_AWAY_O2_ET;
    private String MDC_BLD_PERF_INDEX;
    private String MDC_CONC_AWAY_SEVOFL_INSP;
    private String MNDRY_ECG_COUPLETS_RATE;
    private String MDC_ECG_ELEC_POTL_I;
    private String MDC_CONC_AWAY_SEVOFL;
    private String MDC_ECG_V_P_C_RATE;

    @Override
    public String toString() {
        return "id\n" +
                "MINDRAY_N_SERIES;" +MINDRAY_N_SERIES+"\n"+
                "INSERT_TIME;" +INSERT_TIME+"\n"+
                "MDC_ECG_ELEC_POTL_V5;" +MDC_ECG_ELEC_POTL_V5+"\n"+
                "MDC_ECG_ELEC_POTL_II;" +MDC_ECG_ELEC_POTL_II+"\n"+
                "MDC_ECG_ELEC_POTL_V6;" +MDC_ECG_ELEC_POTL_V6+"\n"+
                "MDC_ECG_ELEC_POTL_V3;" +MDC_ECG_ELEC_POTL_V3+"\n"+
                "MDC_CONC_AWAY_CO2;" +MDC_CONC_AWAY_CO2+"\n"+
                "MDC_ECG_ELEC_POTL_V4;" +MDC_ECG_ELEC_POTL_V4+"\n"+
                "MDC_CO2_RESP_RATE;" +MDC_CO2_RESP_RATE+"\n"+
                "MDC_CONC_AWAY_CO2_INSP;" +MDC_CONC_AWAY_CO2_INSP+"\n"+
                "MDC_ECG_ELEC_POTL_V1;" +MDC_ECG_ELEC_POTL_V1+"\n"+
                "MDC_ECG_ELEC_POTL_V2;" +MDC_ECG_ELEC_POTL_V2+"\n"+
                "MDC_ATTR_SAMP_RATE;" +MDC_ATTR_SAMP_RATE+"\n"+
                "MDC_TTHOR_RESP_RATE;" +MDC_TTHOR_RESP_RATE+"\n"+
                "MDC_IMPED_TTHOR;" +MDC_IMPED_TTHOR+"\n"+
                "MDC_ECG_HEART_RATE;" +MDC_ECG_HEART_RATE+"\n"+
                "MNDRY_ECG_P_V_C_RonT_RATE;" +MNDRY_ECG_P_V_C_RonT_RATE+"\n"+
                "MDC_CONC_AWAY_SEVOFL_ET;" +MDC_CONC_AWAY_SEVOFL_ET+"\n"+
                "MDC_CONC_AWAY_O2;" +MDC_CONC_AWAY_O2+"\n"+
                "MDC_ECG_ELEC_POTL_III;" +MDC_ECG_ELEC_POTL_III+"\n"+
                "MDC_CONC_AWAY_CO2_ET;" +MDC_CONC_AWAY_CO2_ET+"\n"+
                "MNDRY_CONC_MAC;" +MNDRY_CONC_MAC+"\n"+
                "MDC_ECG_ELEC_POTL_AVF;" +MDC_ECG_ELEC_POTL_AVF+"\n"+
                "MDC_CONC_AWAY_N2O_ET;" +MDC_CONC_AWAY_N2O_ET+"\n"+
                "MDC_EVT_INOP;" +MDC_EVT_INOP+"\n"+
                "MDC_PULS_OXIM_SAT_O2;" +MDC_PULS_OXIM_SAT_O2+"\n"+
                "MNDRY_ECG_VPB_RATE;" +MNDRY_ECG_VPB_RATE+"\n"+
                "MDC_CONC_AWAY_O2_INSP;" +MDC_CONC_AWAY_O2_INSP+"\n"+
                "MDC_PULS_OXIM_PLETH;" +MDC_PULS_OXIM_PLETH+"\n"+
                "MNDRY_ECG_PAUSE_RATE;" +MNDRY_ECG_PAUSE_RATE+"\n"+
                "MDC_ECG_ELEC_POTL_AVL;" +MDC_ECG_ELEC_POTL_AVL+"\n"+
                "MDC_ECG_ELEC_POTL_AVR;" +MDC_ECG_ELEC_POTL_AVR+"\n"+
                "MDC_CONC_AWAY_N2O;" +MDC_CONC_AWAY_N2O+"\n"+
                "MNDRY_ECG_MISSED_BEATS_RATE;" +MNDRY_ECG_MISSED_BEATS_RATE+"\n"+
                "MDC_ATTR_NU_MSMT_RES;" +MDC_ATTR_NU_MSMT_RES+"\n"+
                "MDC_CONC_AWAY_N2O_INSP;" +MDC_CONC_AWAY_N2O_INSP+"\n"+
                "MDC_PULS_OXIM_PULS_RATE;" +MDC_PULS_OXIM_PULS_RATE+"\n"+
                "MDC_CONC_AWAY_O2_ET;" +MDC_CONC_AWAY_O2_ET+"\n"+
                "MDC_BLD_PERF_INDEX;" +MDC_BLD_PERF_INDEX+"\n"+
                "MDC_CONC_AWAY_SEVOFL_INSP;" +MDC_CONC_AWAY_SEVOFL_INSP+"\n"+
                "MNDRY_ECG_COUPLETS_RATE;" +MNDRY_ECG_COUPLETS_RATE+"\n"+
                "MDC_ECG_ELEC_POTL_I;" +MDC_ECG_ELEC_POTL_I+"\n"+
                "MDC_CONC_AWAY_SEVOFL;" +MDC_CONC_AWAY_SEVOFL+"\n"+
                "MDC_ECG_V_P_C_RATE;" +MDC_ECG_V_P_C_RATE+"\n"+
                "\n";
    }
}
