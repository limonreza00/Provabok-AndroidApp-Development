package com.coderscastle.provabok.model

import kotlinx.serialization.Serializable

@Serializable
data class JobResponse(
    val jobId: String,
    val title: String,
    val institution: Institution,
    val working: Working,
    val totalVacancy: Int?,
    val contact: Contact,
    val apply: Apply,
    val sources: Sources,
    val details: String?,
    val description: String?,
    val posts: List<Post>
)

@Serializable
data class Institution(
    val name: String,
    val logo: String?,
    val types: InstitutionTypes
)

@Serializable
data class InstitutionTypes(
    val status: String,
    val industrialCategories: IndustrialCategories
)

@Serializable
data class IndustrialCategories(
    val name: String,
    val bangla_name: String
)

@Serializable
data class Working(
    val style: String,
    val period: String
)

@Serializable
data class Contact(
    val number: ContactNumber,
    val online: ContactOnline,
    val address: String,
    val location: String?
)

@Serializable
data class ContactNumber(
    val land_phone: String?,
    val mobile_phone: String,
    val fax: String?
)

@Serializable
data class ContactOnline(
    val email: String,
    val website: String?,
    val linked: String?,
    val x: String?,
    val facebook: String?,
    val youtube: String?
)

@Serializable
data class Apply(
    val start_date: String,
    val close_date: String,
    val medium: String,
    val link: String?,
    val total_fee: Int?
)

@Serializable
data class Sources(
    val link: String?,
    val image: SourceImage?
)

@Serializable
data class SourceImage(
    val display_url: String?,
    val delete_url: String?,
    val img: String?,
    val medium: String?,
    val thumb: String?
)

@Serializable
data class Post(
    val title: String,
    val name: String?,
    val vacancy: String?,
    val summary: String?,
    val requirements: Requirements,
    val responsibilities: Responsibilities?,
    val working: WorkingDetails,
    val purpose: String?,
    val benefits: String?,
    val apply: PostApply,
    val sources: PostSources,
    val salary: String?,
    val details: String?,
    val description: String?
)

@Serializable
data class Requirements(
    val gender: String?,
    val qualifications: Qualifications
)

@Serializable
data class Qualifications(
    val graduations: String?,
    val experiences: String?,
    val skills: String?,
    val certificates: String?
)

@Serializable
data class Responsibilities(
    val task: String?,
    val additional: String?
)

@Serializable
data class WorkingDetails(
    val style: String?,
    val period: String?,
    val address: String?,
    val location: String?
)

@Serializable
data class PostApply(
    val start_date: String?,
    val close_date: String?,
    val medium: String?,
    val link: String?,
    val fee: String?,
    val guidelines: String?
)

@Serializable
data class PostSources(
    val link: String?
)
