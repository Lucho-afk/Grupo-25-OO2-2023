import { DeviceList } from "./DeviceList";

export const DeviceControl = ({
  setCurrentDevice,
  currentDevice,
}: {
  currentDevice: number | undefined;
  setCurrentDevice: (device: number) => void;
}) => {
  return (
    <div className="flex flex-col gap-2">
      <div className="flex justify-between">
        <h1 className="text-slate-950 text-xl font-semibold">
          Mis Dispositivos
        </h1>
      </div>
      <DeviceList
        currentDevice={currentDevice}
        setCurrentDevice={setCurrentDevice}
      />
    </div>
  );
};
