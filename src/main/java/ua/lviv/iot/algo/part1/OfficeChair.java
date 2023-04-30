package ua.lviv.iot.algo.part1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Headers;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class OfficeChair extends Chair {
    private int backAngle;
    private String materialUpholstary;
    private int angle;

    private static final String HEADERS = "backAngle, materialUpholstary, angle";

    public OfficeChair(final String material, final int maxWeight,final  String owner,final int backAngle,final String materialUpholstary) {
        super(material, maxWeight, owner);
        this.backAngle = backAngle;
        this.materialUpholstary = materialUpholstary;
    }

    public void adjustPosition(final int angle) {
        this.angle += angle;
    }

    public String getHeaders() {
        return HEADERS + "," + super.getHeaders();
    }

    public String toCSV(){
        return backAngle + "," + materialUpholstary + "," + angle + "," + super.toCSV() ;
    }
}

