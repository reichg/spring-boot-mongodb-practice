package com.gabereichenberger.mongodb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "shipwrecks")
public class ShipWreck {

    public String recrd;
    public String vesslterms;
    public String feature_type;
    public String chart;
    public String latdec;
    public String londec;
    public String gp_quality;
    public String depth;
    public String sounding_type;
    public String history;
    public String watlev;
    public Double[] coordinates;
}






