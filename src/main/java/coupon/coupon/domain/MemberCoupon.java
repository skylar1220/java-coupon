package coupon.coupon.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "member_coupon")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class MemberCoupon {

    @Id
    private Long id;

    @Column(name = "coupon_id", nullable = false)
    private long couponId;

    @Column(name = "member_id", nullable = false)
    private long memberId;

    @Column(name = "is_used", nullable = false)
    private boolean used;

    private LocalDateTime issuedAt;

    private LocalDateTime expiresAt;
}