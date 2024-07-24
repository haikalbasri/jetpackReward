package com.sunforia.jetreward.di

import com.sunforia.jetreward.data.RewardRepository

object Injection {
    fun provideRepository(): RewardRepository {
        return RewardRepository.getInstance()
    }
}