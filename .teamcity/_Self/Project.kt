package _Self

import _Self.buildTypes.Compatibility
import _Self.buildTypes.LongRunning
import _Self.buildTypes.Nvim
import _Self.buildTypes.PluginVerifier
import _Self.buildTypes.PropertyBased
import _Self.buildTypes.Qodana
import _Self.buildTypes.TestsForIntelliJEAP
import _Self.subprojects.GitHub
import _Self.subprojects.OldTests
import _Self.subprojects.Releases
import _Self.vcsRoots.Branch_181
import _Self.vcsRoots.Branch_183
import _Self.vcsRoots.Branch_191_193
import _Self.vcsRoots.Branch_201
import _Self.vcsRoots.Branch_202
import _Self.vcsRoots.Branch_203_212
import _Self.vcsRoots.Branch_213_221
import _Self.vcsRoots.Branch_Release
import _Self.vcsRoots.GitHubPullRequest
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
  description = "Vim emulation plugin for the IntelliJ platform products"

  subProjects(Releases, OldTests, GitHub)

  // VCS roots
  vcsRoot(Branch_183)
  vcsRoot(Branch_181)
  vcsRoot(Branch_191_193)
  vcsRoot(Branch_201)
  vcsRoot(Branch_202)
  vcsRoot(Branch_203_212)
  vcsRoot(Branch_213_221)
  vcsRoot(Branch_Release)
  vcsRoot(GitHubPullRequest)

  // Builds
  buildType(TestsForIntelliJEAP)
  buildType(TestsForIntelliJ20222)

  buildType(PropertyBased)
  buildType(LongRunning)

  buildType(Nvim)
  buildType(PluginVerifier)
  buildType(Compatibility)

  buildType(Qodana)

  // Unknown staff generated by TeamCity
  features {
    feature {
      type = "CloudImage"
      id = "PROJECT_EXT_768"
      param("agent_pool_id", "41")
      param("amazon-id", "ami-0fa17ce8238eb8868")
      param("ebs-optimized", "false")
      param("image-instances-limit", "")
      param("image-name-prefix", "BuildAgentsIdeaVim")
      param("instance-type", "c5d.xlarge")
      param("key-pair-name", "teamcity-prod-pub")
      param("profileId", "amazon-48")
      param("security-group-ids", "sg-eda08696,sg-7332cf0f,")
      param("source-id", "BuildAgentsIdeaVim")
      param("spot-instance-price", "0.12")
      param("subnet-id", "subnet-58839511")
      param("use-spot-instances", "true")
      param("user-tags", "project=idea-vim")
      param("key-pair-name", "")
      param("spot-instance-price", "")
    }
    feature {
      type = "CloudProfile"
      id = "amazon-48"
      param("agentPushPreset", "")
      param("cloud-code", "amazon")
      param("description", "")
      param("enabled", "true")
      param("max-running-instances", "10")
      param("name", "Cloud Agents")
      param("next-hour", "")
      param("not-checked", "")
      param("profileId", "amazon-48")
      param("profileServerUrl", "")
      param("region", "eu-west-1")
      param("secure:access-id", "credentialsJSON:dbcdb2a2-de5f-4bc9-9421-292b19e83947")
      param("secure:secret-key", "credentialsJSON:65a87fe7-0977-4af9-96f1-344f2b82d269")
      param("system.cloud.profile_id", "amazon-48")
      param("terminate-idle-time", "15")
      param("total-work-time", "")
      param("user-script", "")
      param("spot-fleet-config", "")
      param("terminate-after-build", "true")
      param("name", "Cloud Agents - Single Build")
    }
  }
})
