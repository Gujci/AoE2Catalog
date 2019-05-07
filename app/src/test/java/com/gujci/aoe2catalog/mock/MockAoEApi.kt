package com.gujci.aoe2catalog.mock

import com.gujci.aoe2catalog.model.*
import com.gujci.aoe2catalog.model.Unit
import com.gujci.aoe2catalog.network.AoEApi

class MockAoEApi : AoEApi {

    override suspend fun getStructures(): StructureList {
        return StructureList(listOf(Structure(1,
                "test",
                "test",
                "test Age",
                20,
                100,
                2,
                "0/0",
                "infinite",
                2.0,
                2, Cost(1, 1, 1, 1))))
    }

    override suspend fun getUnits(): UnitList {
        return UnitList(listOf(Unit(1,
                "tester",
                "test",
                "test",
                "test",
                10,
                10.0,
                10.0,
                10.0,
                10,
                10,
                "infinite",
                10,
                "test",
                listOf("nothing"),
                listOf("nothing"),
                10,
                "test",
                10.0, Cost(1,1,1,1)
        )))
    }

    override suspend fun getTechnologies(): TechnologyList {
        return TechnologyList(listOf(Technology(1,
                "test",
                "test",
                "test",
                "test Age",
                "testing env",
                10,
                Cost(1, 1, 1, 1))))
    }

    override suspend fun getCivilizations(): CivilizationList {
        return CivilizationList(listOf(Civilization(1,
                "Test",
                "test",
                "testing army",
                "the tester",
                "testing",
                "everybody can test",
                listOf("testing in advance", "testing by mocking"))))
    }

    override suspend fun getCivilization(id: Int): Civilization {
        return Civilization(1,
                "Test",
                "test",
                "testing army",
                "the tester",
                "testing",
                "everybody can test",
                listOf("testing in advance", "testing by mocking"))
    }

    override suspend fun getUnit(id: Int): Unit {
        return Unit(1,
                "tester",
                "test",
                "test",
                "test",
                10,
                 10.0,
                10.0,
                10.0,
                10,
                10,
                "infinite",
                10,
                "test",
                listOf("nothing"),
                listOf("nothing"),
                10,
                "test",
                10.0, Cost(1,1,1,1)
                )
    }

    override suspend fun getStructure(id: Int): Structure {
        return Structure(1,
                "test",
                "test",
                "test Age",
                20,
                100,
                2,
                "0/0",
                "infinite",
                2.0,
                2, Cost(1, 1, 1, 1))
    }

    override suspend fun getTechnology(id: Int): Technology {
        return Technology(1,
                "test",
                "test",
                "test",
                "test Age",
                "testing env",
                10,
                Cost(1, 1, 1, 1))
    }
}