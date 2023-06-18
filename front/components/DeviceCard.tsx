"use client";

import { DefaultDeviceIcon } from "./Icons";

type Props = {
  name: DeviceNames;
  status: string;
  Icon?: (props: { theme: Themes }) => JSX.Element;
  handleChange?: (deviceName: DeviceNames) => void;
  selected?: boolean;
};

export const DeviceCard = ({
  name,
  status,
  Icon = () => <DefaultDeviceIcon theme="light" />,
  handleChange = () => {},
  selected = false,
}: Props) => {
  console.log("1");
  return (
    <div>
      <button
        className={`flex  p-2  border-2 border-slate-950 rounded-lg cursor-pointer transition-all duration-300 ${
          selected ? "bg-slate-950" : "bg-white"
        }`}
        onClick={() => handleChange(name as DeviceNames)}
      >
        <div className="flex items-center justify-center w-12 h-12">
          <Icon theme={selected ? "dark" : "light"} />
        </div>
      </button>
      <p className="font-semibold text-slate-950 text-center">{name}</p>
    </div>
  );
};
