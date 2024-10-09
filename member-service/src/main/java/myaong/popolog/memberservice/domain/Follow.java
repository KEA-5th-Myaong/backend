package myaong.popolog.memberservice.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "`follow`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"following", "followed"})})
@Getter
@Setter
public class Follow extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "follow_id")
	private Long id;

	// 팔로우하는 사람
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "following", nullable = false)
	private Member following;

	// 팔로우된 사람
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "followed", nullable = false)
	private Member followed;
}
