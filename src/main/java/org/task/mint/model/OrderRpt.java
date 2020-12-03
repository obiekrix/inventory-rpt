package org.task.mint.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRpt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Date date;
    private Long total_order;
    private BigDecimal total_order_amount;

}
