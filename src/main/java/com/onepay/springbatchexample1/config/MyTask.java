package com.onepay.springbatchexample1.config;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@StepScope
public class MyTask implements Tasklet {

    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        String date = chunkContext.getStepContext().getStepExecution().getJobParameters().getString("time");
        System.out.println("date==="+date);
        System.out.println("MyTaskTwo start..");

        // ... your code

        System.out.println("MyTaskTwo done..");
        return RepeatStatus.FINISHED;
    }
}
