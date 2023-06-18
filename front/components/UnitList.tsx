"use client";

import { useState } from "react";
import { DeviceCard } from "./DeviceCard";
import { LightIcon, ParkingIcon, TrashIcon, TreeIcon } from "./Icons";
import { UnitCard } from "./UnitCard";

const NAME_TO_ICON: NameToIcon = {
  Parking: ParkingIcon,
  Trash: TrashIcon,
  Light: LightIcon,
  Watering: TreeIcon,
};

export const UnitList = ({
  units,
  setUnits = () => null,
}: {
  units: UnitProps[];
  setUnits: (units: UnitProps[]) => void;
}) => {
  const handleDelete = (id: number) => {
    setUnits(units.filter((unit) => unit.id !== id));
  };

  return (
    <div className="flex flex-col gap-4">
      {units.map((unit) => (
        <UnitCard unit={unit} handleDelete={handleDelete} key={unit.id} />
      ))}
    </div>
  );
};
