package com.practice.infinityprac.project;

import com.practice.infinityprac.projecttags.ProjectTagsEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

  private String projectName;

  private String imgUrl;

//  private List<ProjectTagsEntity> projectTags;
}
