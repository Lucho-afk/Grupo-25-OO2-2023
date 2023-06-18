"use client";

import { useState } from "react";
import { DeviceCard } from "./DeviceCard";
import { LightIcon, ParkingIcon, TrashIcon, TreeIcon } from "./Icons";

const NAME_TO_ICON: NameToIcon = {
  Parking: ParkingIcon,
  Trash: TrashIcon,
  Light: LightIcon,
  Watering: TreeIcon,
};

export const DeviceList = ({
  currentDevice,
  setCurrentDevice,
}: {
  currentDevice: number | undefined;
  setCurrentDevice: (device: number) => void;
}) => {
  const [devices, setDevices] = useState<DeviceProps[]>([
    {
      id: 1,
      name: "Parking",
      status: "1",
    },
    {
      id: 2,
      name: "Trash",
      status: "1",
    },
    {
      id: 3,
      name: "Light",
      status: "1",
    },
    {
      id: 4,
      name: "Watering",
      status: "1",
    },
  ]);

  return (
    <div className="flex flex-col items-center justify-center w-full h-full">
      <div className="flex w-full overflow-x-auto flex-nowrap ">
        <div className="flex w-full h-full gap-4 flex-nowrap">
          {devices.map((device) => (
            <DeviceCard
              selected={currentDevice === device.id}
              key={device.id}
              handleChange={() => setCurrentDevice(device.id)}
              name={device.name}
              status={device.status}
              Icon={NAME_TO_ICON[device.name]}
            />
          ))}
        </div>
      </div>
    </div>
  );
};
