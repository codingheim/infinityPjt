package com.practice.infinityprac.projecttags;

import com.practice.infinityprac.project.ProjectEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table
@NoArgsConstructor
public class ProjectTagsEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long projectTagsId;

  private String tagName;

  public ProjectTagsEntity(ProjectTagsDto projectTagsDto) {
    this.projectTagsId = projectTagsDto.getProjectTagsId();
    this.tagName = projectTagsDto.getTagName();
  }



//  @ManyToOne
//  private Tag tag;

  @ManyToOne
  @JoinColumn(name = "PROJECT_ID")
  private ProjectEntity project;
}
