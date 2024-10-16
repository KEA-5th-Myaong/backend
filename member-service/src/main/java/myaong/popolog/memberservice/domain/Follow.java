package myaong.popolog.memberservice.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`follow`",
		uniqueConstraints = {@UniqueConstraint(columnNames = {"following", "followed"})})
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Follow extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "follow_id")
	private Long id;

	// 팔로우하는 사람
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "following", nullable = false, updatable = false)
	private Member following;

	// 팔로우된 사람
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "followed", nullable = false, updatable = false)
	private Member followed;
}
