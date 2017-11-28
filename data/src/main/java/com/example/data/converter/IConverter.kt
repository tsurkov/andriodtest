package com.example.data.converter

/**
 * Created by tsurkov on 21.11.2017.
 */
interface IConverter<TDataModel, TDomainModel> {
    fun mapToDomain(dataModel:TDataModel):TDomainModel
    fun mapToData(dataModel:TDomainModel):TDataModel
}