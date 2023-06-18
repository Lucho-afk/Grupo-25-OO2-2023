import { useState } from "react";
import { DeviceList } from "./DeviceList";
import { UnitList } from "./UnitList";
import { AddUnitButton } from "./AddUnitButton";

export const UnitControl = ({
  setCurrentDevice,
  currentDevice,
}: {
  currentDevice: number | undefined;
  setCurrentDevice: (device: number) => void;
}) => {
  const [units, setUnits] = useState<UnitProps[]>([
    {
      id: 1,
      name: "Parking #1",
      status: "1",
    },
    {
      id: 2,
      name: "Parking #2",
      status: "1",
    },
    {
      id: 3,
      name: "Parking #3",
      status: "1",
    },
    {
      id: 4,
      name: "Parking #4",
      status: "1",
    },
  ]);

  const handleAddUnit = (unitName: string) => {
    setUnits([
      {
        id: units.length + 1,
        name: unitName,
        status: "1",
      },
      ...units,
    ]);
  };

  return (
    <div className="flex flex-col gap-2">
      <div className="flex justify-between items-center">
        <h1 className="text-slate-950 text-xl font-semibold">Mis Unidades</h1>
        <AddUnitButton handleAddUnit={handleAddUnit} />
      </div>
      <UnitList units={units} setUnits={setUnits} />
    </div>
  );
};
