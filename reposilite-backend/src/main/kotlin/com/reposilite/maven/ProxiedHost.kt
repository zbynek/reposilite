package com.reposilite.maven

import com.reposilite.settings.api.SharedConfiguration.RepositoryConfiguration.ProxiedHostConfiguration
import com.reposilite.shared.http.RemoteClient

data class ProxiedHost(
    val host: String,
    val configuration: ProxiedHostConfiguration,
    val client: RemoteClient
)
