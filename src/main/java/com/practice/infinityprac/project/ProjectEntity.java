package com.practice.infinityprac.project;

import com.practice.infinityprac.projecttags.ProjectTagsEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@Entity
@Table
@RequiredArgsConstructor
public class ProjectEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long projectId;

  @Column(nullable = false)
  private String projectName;

  @Column(nullable = false)
  private String imgUrl;

  @OneToMany(mappedBy = "PROJECT_ID")
  @JoinColumn(name = "PROJECT_TAGS")
  private List<ProjectTagsEntity> projectTags;

  @OneToMany(mappedBy = "")
  @JoinColumn(name = "WORKSPACE_ID")
  private workspace workspace;

  public ProjectEntity(ProjectDto projectDto) {
    this.projectName = projectDto.getProjectName();
    this.imgUrl = projectDto.getImgUrl();
//    this.projectTags = projectDto.getProjectTags();
  }

  public void updateProject(ProjectDto projectDto) {
    this.projectName = projectDto.getProjectName();
    this.imgUrl = projectDto.getImgUrl();
//    this.projectTags = projectDto.getProjectTags();
  }
}
