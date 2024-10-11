package myaong.popolog.prejobsservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`preferred_job`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"member_id", "job_id"})})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PreferredJob extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "preferred_job_id")
	private Long id;

	// 회원 아이디
	@Column(name = "member_id", nullable = false, updatable = false)
	private Long member_id;

	// 직군
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "job_id", nullable = false, updatable = false)
	private Job job;
}
