package com.aj.lld.interviewquestions.elevator;

import java.util.List;

import com.aj.lld.interviewquestions.elevator.enums.ElevatorDirection;

public interface ElevatorSelectionStrategy {

    ElevatorController selectElevator(List<ElevatorController> controllers,
                                      int requestFloor,
                                      ElevatorDirection direction);
}
